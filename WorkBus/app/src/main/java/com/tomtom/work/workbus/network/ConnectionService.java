package com.tomtom.work.workbus.network;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.tomtom.work.workbus.bus.RoadRequestEvent;
import com.tomtom.work.workbus.bus.BusProvider;
import com.tomtom.work.workbus.bus.RoutesResponseEvent;
import com.tomtom.work.workbus.route.respons.Routes;
import com.tomtom.work.workbus.route.respons.RoutesList;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import timber.log.Timber;

import java.util.List;

public class ConnectionService extends Service {

    private TransitartService transService;

    public ConnectionService() {
    }

    Bus bus = BusProvider.getDefaultBus();

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.d("onCreate ");
        bus.register(this);
        TransitartRequester transitartRequester= new TransitartRequester(getApplicationContext());
        transService = transitartRequester.setupInterface(TransitartService.class);
    }


    @Subscribe
    public void request(final RoadRequestEvent event){
        Timber.d("new request " + event);
        transService.getDeparture(new RouteRequestConventer().doForward(event)).map(new Func1<Routes, List<RoutesList>>() {
            @Override
            public List<RoutesList> call(Routes routes) {
                return routes.getRoutesList();
            }
        })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Action1<List<RoutesList>>() {
            @Override
            public void call(List<RoutesList> routesLists) {
                bus.post(new RoutesResponseEvent(routesLists));
            }
        });
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Timber.d("onStartCommand " + flags +  " startId=" + startId);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

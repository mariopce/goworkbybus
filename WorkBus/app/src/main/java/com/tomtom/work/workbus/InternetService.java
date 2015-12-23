package com.tomtom.work.workbus;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.google.common.base.Converter;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.tomtom.work.workbus.network.TransitartRequester;
import com.tomtom.work.workbus.network.TransitartService;
import com.tomtom.work.workbus.route.RouteRequestEvent;
import com.tomtom.work.workbus.route.RouteResponseEvent;
import com.tomtom.work.workbus.route.req.From;
import com.tomtom.work.workbus.route.req.Route;
import com.tomtom.work.workbus.route.req.To;
import com.tomtom.work.workbus.route.respons.Routes;
import com.tomtom.work.workbus.route.respons.RoutesList;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import timber.log.Timber;

import java.util.List;

public class InternetService extends Service {


    private TransitartService transitartService;


    public InternetService() {
    }

    Bus bus = BusProvider.getDefault();

    @Override
    public void onCreate() {
        super.onCreate();
        bus.register(this);
        TransitartRequester requester = new TransitartRequester();
        transitartService = requester.setupInterface(TransitartService.class);
    }

    @Subscribe
    public void onRouteRequestEvent(RouteRequestEvent event) {
        Toast.makeText(getApplicationContext(), "event  " + event.getCurrentTimeInEuroFormat(), Toast.LENGTH_SHORT).show();
        Observable<Routes> observable = transitartService.getDeparture(new RouteRequestEventConventer().doForward(event));
        observable.map(new Func1<Routes, List<RoutesList>>() {
            @Override
            public List<RoutesList> call(Routes routes) {
                return routes.getRoutesList();
            }
        }).subscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(new Observer<List<RoutesList>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("Im", e.getMessage(), e);
                Timber.e("Error when call clound", e);
                Toast.makeText(getApplicationContext(), "Error when call clound", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNext(List<RoutesList> routes) {
                bus.post(new RouteResponseEvent(routes));
            }
        });
    }

    public static class RouteRequestEventConventer extends Converter<RouteRequestEvent, Route> {

        public static final boolean ACCESSIBLE_DEFAULT_VALUE = false;
        public static final String DEFAULT_ROUTE_TYPE = "OPTIMAL";

        @Override
        protected Route doForward(RouteRequestEvent event) {
            Route route = new Route();
            route.withFrom(new From()
                                   .withLat(convertDoubleToString(event.getFrom().getLatitude()))
                                   .withLng(convertDoubleToString(event.getFrom().getLongitude())));
            route.withTo(new To().withLat(convertDoubleToString(event.getTo().getLatitude()))
                                 .withLng(convertDoubleToString(event.getTo().getLongitude())));
            route.withDateTime(event.getCurrentTimeInEuroFormat());
            route.withWheelchairAccessibleTripsOnly(ACCESSIBLE_DEFAULT_VALUE);
            route.withRoutingType(DEFAULT_ROUTE_TYPE);

            return route;
        }

        private String convertDoubleToString(Double value) {
            return String.valueOf(value);
        }

        @Override
        protected RouteRequestEvent doBackward(Route route) {
            return null;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}

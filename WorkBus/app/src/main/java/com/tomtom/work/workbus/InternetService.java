package com.tomtom.work.workbus;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.tomtom.work.workbus.route.RouteRequestEvent;

public class InternetService extends Service {


    public InternetService() {
    }

    Bus bus = BusProvider.getDefault();
    @Override
    public void onCreate() {
        super.onCreate();
        bus.register(this);
    }

    @Subscribe
    public void onRouteRequestEvent(RouteRequestEvent event){
        Toast.makeText(getApplicationContext(), "event  " + event.getCurrentTimeInEuroFormat() , Toast.LENGTH_SHORT).show();
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

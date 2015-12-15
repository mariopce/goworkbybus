package com.tomtom.work.workbus.network;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.tomtom.work.workbus.RoadRequestEvent;

public class ConnectionService extends Service {

    public ConnectionService() {
    }

    Bus bus = new Bus();
    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Subscribe
    public void request(RoadRequestEvent event){

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

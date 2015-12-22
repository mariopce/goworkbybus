package com.tomtom.work.workbus;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

import com.squareup.otto.Bus;
import com.tomtom.work.workbus.location.BaseLocationListener;
import com.tomtom.work.workbus.location.TextViewLocationListener;
import com.tomtom.work.workbus.route.RouteRequestEvent;
import com.tomtom.work.workbus.time.DataProvider;
import com.tomtom.work.workbus.time.RealDataProvider;

public class RouteServiceRequester extends BaseLocationListener implements ServiceRequester {

    Bus bus = BusProvider.getDefault();
    private DataProvider dataProvider = new RealDataProvider();
    private LocationListener locationListener;
    private Location from;

    public RouteServiceRequester(LocationListener locationListener) {
        this.locationListener = locationListener;
    }

    @Override
    public Location getFrom() {
        return from;
    }

    @Override
    public void sendRequest(Location to) {
        bus.post(new RouteRequestEvent(getFrom(), to, dataProvider.getCurrentTimeInEuroFormat()));
    }

    @Override
    public void onLocationChanged(Location location) {
        locationListener.onLocationChanged(location);
        from = location;
    }

}

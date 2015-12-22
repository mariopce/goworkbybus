package com.tomtom.work.workbus.location;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

public class GpsLocationProvider {


    public static final int MIN_TIME = 400;
    public static final int MIN_DISTANCE = 50;
    private final LocationManager locationManager;
    private final String provider;
    private LocationListener listner;

    public GpsLocationProvider(Context context) {
        locationManager = (LocationManager)context.getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_MEDIUM);
        provider =  locationManager.getBestProvider(criteria, false);
    }

    public void startListen(LocationListener listener){
        this.listner = listener;
        Location location = locationManager.getLastKnownLocation(provider);
        listener.onLocationChanged(location);
        locationManager.requestLocationUpdates(provider, MIN_TIME, MIN_DISTANCE, listener);
    }
    public void stopListen(){
        locationManager.removeUpdates(listner);
    }
}

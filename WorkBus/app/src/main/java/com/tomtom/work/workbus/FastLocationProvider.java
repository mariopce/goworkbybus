package com.tomtom.work.workbus;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.util.Log;

import timber.log.Timber;

/**
 * Created by mario on 14.12.15.
 */
public class FastLocationProvider {

    public static final int MIN_DISTANCE_M = 50;
    public static final int MIN_TIME = 400;
    private static final String TAG = "FastLocationProvider";
    private final String provider;
    private Context context;
    private LocationManager locationManager;
    private LocationListener listener;

    public FastLocationProvider(Context context) {
        this.context = context;
        // Get the location manager
        locationManager = (LocationManager) this.context.getSystemService(Context.LOCATION_SERVICE);
        // Define the criteria how to select the locatioin provider -> use
        // default
        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_MEDIUM);

        provider = locationManager.getBestProvider(criteria, false);
        Timber.d("Location manager choose the best location provider " + provider);
    }

    public void startListen(LocationListener listener) {
        this.listener = listener;
        Location location = locationManager.getLastKnownLocation(provider);
        listener.onLocationChanged(location);
        locationManager.requestLocationUpdates(provider, MIN_TIME, MIN_DISTANCE_M, listener);
    }

    public void shutDown() {
        locationManager.removeUpdates(listener);
    }

}

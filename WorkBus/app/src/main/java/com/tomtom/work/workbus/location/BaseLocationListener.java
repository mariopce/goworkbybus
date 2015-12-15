package com.tomtom.work.workbus.location;

import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseLocationListener implements LocationListener{


    static final String TAG = "LocationListener";

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        if (Log.isLoggable(TAG, Log.DEBUG)) {
            Log.d(TAG, "onStatusChanged");
        }
    }

    @Override
    public void onProviderEnabled(String provider) {
        if (Log.isLoggable(TAG, Log.DEBUG)) {
            Log.d(TAG, "onProviderEnabled" + provider);
        }
    }

    @Override
    public void onProviderDisabled(String provider) {
        if (Log.isLoggable(TAG, Log.DEBUG)) {
            Log.d(TAG, "onProviderDisabled" + provider);
        }
    }
}

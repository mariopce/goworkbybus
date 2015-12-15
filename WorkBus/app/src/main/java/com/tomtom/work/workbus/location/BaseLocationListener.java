package com.tomtom.work.workbus.location;

import android.location.LocationListener;
import android.os.Bundle;

import timber.log.Timber;

public abstract class BaseLocationListener implements LocationListener {

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Timber.d("onStatusChanged");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Timber.d("onProviderEnabled" + provider);

    }

    @Override
    public void onProviderDisabled(String provider) {
        Timber.d("onProviderDisabled" + provider);
    }
}

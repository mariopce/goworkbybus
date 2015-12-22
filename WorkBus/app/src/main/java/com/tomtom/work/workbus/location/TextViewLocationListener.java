package com.tomtom.work.workbus.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

import com.tomtom.work.workbus.formatter.LocationFormatter;

public class TextViewLocationListener implements LocationListener {

    private final LocationFormatter formatter;
    private TextView currentLocationTextView;

    public TextViewLocationListener(TextView currentLocationTextView) {
        this.currentLocationTextView = currentLocationTextView;
        this.formatter = new LocationFormatter(currentLocationTextView.getContext());
    }

    @Override
    public void onLocationChanged(Location location) {
        currentLocationTextView.setText(location.getLatitude() + "," + location.getLongitude());
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}

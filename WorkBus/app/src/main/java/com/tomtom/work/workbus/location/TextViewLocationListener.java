package com.tomtom.work.workbus.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

import com.tomtom.work.workbus.formatter.LocationFormatter;

public class TextViewLocationListener extends BaseLocationListener {

    private final LocationFormatter formatter;
    private TextView currentLocationTextView;

    public TextViewLocationListener(TextView currentLocationTextView) {
        this.currentLocationTextView = currentLocationTextView;
        this.formatter = new LocationFormatter(currentLocationTextView.getContext());
    }

    @Override
    public void onLocationChanged(Location location) {
        currentLocationTextView.setText(formatter.format(location));
    }


}

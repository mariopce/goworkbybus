package com.tomtom.work.workbus.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.TextView;

import com.tomtom.work.workbus.formater.Formatter;
import com.tomtom.work.workbus.formater.LocationFormatter;

public class TextViewLocationListener extends BaseLocationListener{

    private TextView textView;
    private Formatter formatter;
    public TextViewLocationListener(TextView textView) {
        this.textView = textView;
        formatter =  new LocationFormatter(textView.getContext());
    }

    @Override
    public void onLocationChanged(Location location) {
        textView.setText(formatter.format(location));
    }

}

package com.tomtom.work.workbus.formater;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;

import com.tomtom.work.workbus.R;

public class LocationFormatter implements Formatter<Location> {

    private Context context;

    public LocationFormatter(Context context) {
        this.context = context;
    }

    @Override
    public @NonNull String format(Location input) {
        return String.format(context.getString(R.string.current_location_message), input.getLatitude(), input.getLongitude());
    }
}

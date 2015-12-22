package com.tomtom.work.workbus.formatter;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;

import com.tomtom.work.workbus.R;

import timber.log.Timber;

public class LocationFormatter implements Formatter<Location> {

    private Context context;

    public LocationFormatter(Context context) {
        this.context = context;
    }

    @Override
    public @NonNull String format(Location location){
        if (location==null){
            Timber.d("location is null");
            return context.getString(R.string.current_location_is_unknown);
        }
        return "";
    }
}

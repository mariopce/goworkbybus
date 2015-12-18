package com.tomtom.work.workbus;

import android.location.Location;
import android.support.annotation.VisibleForTesting;

import com.squareup.otto.Bus;
import com.tomtom.work.workbus.bus.BusProvider;
import com.tomtom.work.workbus.bus.RoadRequestEvent;
import com.tomtom.work.workbus.date.DateProvider;
import com.tomtom.work.workbus.date.RealDateProvider;
import com.tomtom.work.workbus.location.BaseLocationListener;
import com.tomtom.work.workbus.location.TextViewLocationListener;


public class SenderRoadRequests extends BaseLocationListener implements SenderRequester {


    Bus bus = BusProvider.getDefaultBus();
    private TextViewLocationListener textViewLocationListener;
    private Location from;
    DateProvider dateProvider;

    public SenderRoadRequests(TextViewLocationListener textViewLocationListener) {
        this.textViewLocationListener = textViewLocationListener;
        dateProvider = new RealDateProvider();
    }

    @VisibleForTesting
    public void setDateProvider(DateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    @Override
    public void onLocationChanged(Location location) {
        textViewLocationListener.onLocationChanged(location);
        from = location;
    }

    @Override
    public Location getFrom() {
        return from;
    }

    @Override
    public void sendRequest(Location to) {
        if (from != null) {
            bus.post(new RoadRequestEvent(from, to, dateProvider.getNowInEuroFormat()));
        }
    }
}

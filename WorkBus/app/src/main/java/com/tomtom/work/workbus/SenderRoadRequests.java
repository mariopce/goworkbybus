package com.tomtom.work.workbus;

import android.location.Location;

import com.squareup.otto.Bus;
import com.tomtom.work.workbus.location.BaseLocationListener;
import com.tomtom.work.workbus.location.TextViewLocationListener;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.TimeZone;

public class SenderRoadRequests extends BaseLocationListener {

    Bus bus = new Bus();
    private TextViewLocationListener textViewLocationListener;
    private Location from;

    public SenderRoadRequests(TextViewLocationListener textViewLocationListener) {
        this.textViewLocationListener = textViewLocationListener;
    }

    @Override
    public void onLocationChanged(Location location) {
        textViewLocationListener.onLocationChanged(location);
        from = location;
    }

    public void sendRequest(Location to) {
        if (from != null) {
            LocalDateTime localDateTime = LocalDateTime.now(DateTimeZone.getDefault());
            String now = DateTimeFormat.forPattern("dd-MM-yyyy hh:mm").print(localDateTime);
            bus.post(new RoadRequestEvent(from, to, now));
        }
    }
}

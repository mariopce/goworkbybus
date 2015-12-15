package com.tomtom.work.workbus;

import android.location.Location;

public class RoadRequestEvent {

    private final Location from;
    private final Location to;
    private final String when;

    public RoadRequestEvent(Location from, Location officeLocation, String when) {
        this.from = from;
        this.to = officeLocation;
        this.when = when;
    }
}

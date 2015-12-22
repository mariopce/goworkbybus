package com.tomtom.work.workbus.route;

import android.location.Location;

public class RouteRequestEvent {

    private final Location from;
    private final Location to;
    private final String currentTimeInEuroFormat;

    public RouteRequestEvent(Location from, Location to, String currentTimeInEuroFormat) {
        this.from = from;
        this.to = to;
        this.currentTimeInEuroFormat = currentTimeInEuroFormat;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public String getCurrentTimeInEuroFormat() {
        return currentTimeInEuroFormat;
    }
}

package com.tomtom.work.workbus.bus;

import android.location.Location;

import java.io.Serializable;

public class RoadRequestEvent implements Serializable {

    private final Location from;
    private final Location to;
    private final String when;

    public RoadRequestEvent(Location from, Location officeLocation, String when) {
        this.from = from;
        this.to = officeLocation;
        this.when = when;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }

    public String getWhen() {
        return when;
    }
}

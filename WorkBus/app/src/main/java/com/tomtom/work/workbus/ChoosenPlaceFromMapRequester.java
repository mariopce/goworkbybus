package com.tomtom.work.workbus;

import android.location.Location;

import com.google.android.gms.location.places.Place;

import com.squareup.otto.Bus;
import com.tomtom.work.workbus.bus.BusProvider;
import com.tomtom.work.workbus.bus.RoadRequestEvent;
import com.tomtom.work.workbus.date.DateProvider;
import com.tomtom.work.workbus.date.RealDateProvider;

public class ChoosenPlaceFromMapRequester implements SenderRequester {

    private Place choosenPlace;
    Bus bus = BusProvider.getDefaultBus();
    public ChoosenPlaceFromMapRequester(Place choosenPlace) {
        this.choosenPlace = choosenPlace;
    }

    @Override
    public Location getFrom() {
        Location loc = new Location("user");
        loc.setLatitude(choosenPlace.getLatLng().latitude);
        loc.setLongitude(choosenPlace.getLatLng().longitude);
        return loc;
    }

    @Override
    public void sendRequest(Location to) {
        bus.post(new RoadRequestEvent(getFrom(), to, new RealDateProvider().getNowInEuroFormat()));
    }
}

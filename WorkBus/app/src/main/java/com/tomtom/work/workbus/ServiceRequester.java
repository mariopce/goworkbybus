package com.tomtom.work.workbus;

import android.location.Location;

public interface ServiceRequester {

    Location getFrom();

    public void sendRequest(Location to);

}

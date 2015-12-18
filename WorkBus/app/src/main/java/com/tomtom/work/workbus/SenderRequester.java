package com.tomtom.work.workbus;

import android.location.Location;

public interface SenderRequester {

    Location getFrom();

    void sendRequest(Location to);
}

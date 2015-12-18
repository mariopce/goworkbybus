package com.tomtom.work.workbus.map;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

public interface MapHandler {

    int PLACE_PICKER_REQUEST = 1;

    void startMap(double latitude, double longitude, String label);

    void chooseLocation() throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException;
}

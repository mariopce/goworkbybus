package com.tomtom.work.workbus.map;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.ui.PlacePicker;

public class MapIntentHandler implements MapHandler {

    private Activity activity;

    public MapIntentHandler(Activity activity){

        this.activity = activity;
    }


    @Override
    public void startMap(double latitude, double longitude, String label){
        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        activity.startActivity(intent);
    }

    @Override
    public void chooseLocation() throws GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {

        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

        activity.startActivityForResult(builder.build(activity), PLACE_PICKER_REQUEST);
    }
}

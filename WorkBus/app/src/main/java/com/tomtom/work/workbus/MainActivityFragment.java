package com.tomtom.work.workbus;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.squareup.otto.Bus;
import com.tomtom.work.workbus.location.Locations;
import com.tomtom.work.workbus.location.TextViewLocationListener;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    @Bind(R.id.current_location_tv)
    Button currentLocationTV;

    private FastLocationProvider fastLocationProvider;
    private SenderRoadRequests senderRoadRequests;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);
        fastLocationProvider = new FastLocationProvider(getActivity());
        return rootView;
    }

    @OnClick(R.id.mediahub_button) void clikedOnMediaHub(View view){
        Location loc = Locations.getMediaOfficeLocation();
        senderRoadRequests.sendRequest(loc);
        startMap(loc.getLatitude(), loc.getLongitude(), "Media");

    }
    @OnClick(R.id.orion_button) void clikedOnOrionOffice(View view){
        Location loc =Locations.getOrionOfficeLocation();
        senderRoadRequests.sendRequest(loc);
        startMap(loc.getLatitude(), loc.getLongitude(), "orion");
    }
    @OnClick(R.id.agraf_button) void clikedOnAgrafOffice(View view){
        Location loc = Locations.getAgrafOfficeLocation();
        senderRoadRequests.sendRequest(loc);
        startMap(loc.getLatitude(), loc.getLongitude(), "Agraf");
    }

    @OnClick(R.id.current_location_tv) void clickedOnCurrentLocationButton(View v){
        Location loc = senderRoadRequests.getFrom();
        startMap(loc.getLatitude(), loc.getLongitude(), "Current location");
    }

    public void startMap(double latitude, double longitude, String label){


        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public void onResume() {
        super.onResume();
        senderRoadRequests =  new SenderRoadRequests(new TextViewLocationListener(currentLocationTV));
        fastLocationProvider.startListen(senderRoadRequests);
    }

    @Override
    public void onPause() {
        super.onPause();
        fastLocationProvider.shutDown();
    }

}

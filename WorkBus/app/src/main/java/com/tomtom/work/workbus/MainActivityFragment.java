package com.tomtom.work.workbus;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;

import com.squareup.otto.Bus;
import com.tomtom.work.workbus.location.Locations;
import com.tomtom.work.workbus.location.TextViewLocationListener;
import com.tomtom.work.workbus.map.MapIntentHandler;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    @Bind(R.id.current_location_tv)
    TextView currentLocationTV;

    private FastLocationProvider fastLocationProvider;
    private SenderRequester senderRoadRequests;
    private Place choosenPlace;

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

    public void setChoosenPlace(Place choosenPlace) {
        this.choosenPlace = choosenPlace;
        senderRoadRequests= new ChoosenPlaceFromMapRequester(choosenPlace);

    }

    @OnClick(R.id.mediahub_button) void clikedOnMediaHub(View view){
        //registerStartPoint();
        Location loc = Locations.getMediaOfficeLocation();
        senderRoadRequests.sendRequest(loc);


    }
    @OnClick(R.id.orion_button) void clikedOnOrionOffice(View view){
        //registerStartPoint();
        Location loc =Locations.getOrionOfficeLocation();
        senderRoadRequests.sendRequest(loc);

    }
    @OnClick(R.id.agraf_button) void clikedOnAgrafOffice(View view){
        //registerStartPoint();
        Location loc = Locations.getAgrafOfficeLocation();
        senderRoadRequests.sendRequest(loc);

    }

    @OnClick(R.id.show_location) void clickedOnShowMapButton(View v){
        Location loc = senderRoadRequests.getFrom();
        if (loc !=null){
            new MapIntentHandler(getActivity()).startMap(loc.getLatitude(), loc.getLongitude(), "Current location");
        }
    }
    @OnClick(R.id.current_location_b) void clickStartFromCurrentLocation(View v){
        registerStartPoint();
    }

    private void registerStartPoint() {
        senderRoadRequests =  new SenderRoadRequests(new TextViewLocationListener(currentLocationTV));
        fastLocationProvider.startListen((LocationListener)senderRoadRequests);
    }

    @OnClick(R.id.choose_location) void clickedOnChooseLocation(View v){
        try {
            new MapIntentHandler(getActivity()).chooseLocation();
        } catch (GooglePlayServicesNotAvailableException e) {
            Timber.e("Play services Not available ", e);
        } catch (GooglePlayServicesRepairableException e) {
            Timber.e("Play services Not available ", e);
        }
    }



    @Override
    public void onResume() {
        super.onResume();
        registerStartPoint();
    }

    @Override
    public void onPause() {
        super.onPause();
        fastLocationProvider.shutDown();
    }

}

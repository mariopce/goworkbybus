
package com.tomtom.work.workbus;

import android.location.LocationListener;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tomtom.work.workbus.location.GpsLocationProvider;
import com.tomtom.work.workbus.location.Locations;
import com.tomtom.work.workbus.location.TextViewLocationListener;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private GpsLocationProvider gpsLocationProvider;

    public MainActivityFragment() {
    }

    @Bind(R.id.current_location_tv)
    TextView currentLocationTextView;


    ServiceRequester serviceRequester;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);
        gpsLocationProvider = new GpsLocationProvider(getContext());
        return rootView;
    }

    @Override
    public void onPause() {
        super.onPause();
        gpsLocationProvider.stopListen();
    }

    @Override
    public void onResume() {
        super.onResume();
        serviceRequester = new RouteServiceRequester(new TextViewLocationListener(currentLocationTextView));
        gpsLocationProvider.startListen((LocationListener) serviceRequester);
    }



    @OnClick(R.id.media_button) void onMediaOfficeClick(){
        serviceRequester.sendRequest(Locations.getMediaOfficeLocation());
    }

    @OnClick(R.id.orion_button) void onOrionOfficeClick(){
        serviceRequester.sendRequest(Locations.getOrionOfficeLocation());
    }

    @OnClick(R.id.agraf_button) void onAgrafOfficeClick(){
        serviceRequester.sendRequest(Locations.getAgrafOfficeLocation());
    }
}

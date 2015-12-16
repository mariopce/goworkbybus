package com.tomtom.work.workbus;

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
    TextView currentLocationTV;

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
        senderRoadRequests.sendRequest(Locations.getMediaOfficeLocation());
        new ShowToastClickListener("Clicked on Media Button").onClick(view);

    }
    @OnClick(R.id.orion_button) void clikedOnOrionOffice(View view){
        senderRoadRequests.sendRequest(Locations.getOrionOfficeLocation());
        new ShowToastClickListener("Clicked on Orion Button").onClick(view);
    }
    @OnClick(R.id.agraf_button) void clikedOnAgrafOffice(View view){
        senderRoadRequests.sendRequest(Locations.getAgrafOfficeLocation());
        new ShowToastClickListener("Clicked on Agraf Button").onClick(view);
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

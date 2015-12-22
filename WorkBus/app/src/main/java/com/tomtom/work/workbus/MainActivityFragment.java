
package com.tomtom.work.workbus;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tomtom.work.workbus.location.GpsLocationProvider;
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
        gpsLocationProvider.startListen(new TextViewLocationListener(currentLocationTextView));
    }


    @OnClick(R.id.media_button) void onMediaOfficeClick(){

    }

    @OnClick(R.id.orion_button) void onOrionOfficeClick(){

    }

    @OnClick(R.id.agraf_button) void onAgrafOfficeClick(){

    }
}

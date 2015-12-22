
package com.tomtom.work.workbus;

import android.location.Location;
import android.location.LocationListener;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.tomtom.work.workbus.location.GpsLocationProvider;

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


    public static class TextViewLocationListener implements LocationListener{

        private TextView currentLocationTextView;

        public TextViewLocationListener(TextView currentLocationTextView) {

            this.currentLocationTextView = currentLocationTextView;
        }

        @Override
        public void onLocationChanged(Location location) {
            currentLocationTextView.setText(location.getLatitude() + "," + location.getLongitude());
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }

    @OnClick(R.id.media_button) void onMediaOfficeClick(){

    }

    @OnClick(R.id.orion_button) void onOrionOfficeClick(){

    }

    @OnClick(R.id.agraf_button) void onAgrafOfficeClick(){

    }
}

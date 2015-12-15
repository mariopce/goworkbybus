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
import android.widget.Toast;

import com.tomtom.work.workbus.formater.Formatter;
import com.tomtom.work.workbus.formater.LocationFormatter;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button agrafButton;
    private TextView currentLocationTV;
    private FastLocationProvider fastLocationProvider;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        currentLocationTV = (TextView) rootView.findViewById(R.id.current_location_tv);
        agrafButton =  (Button)rootView.findViewById(R.id.agraf_button);
        agrafButton.setOnClickListener(new ShowToastClickListener("Clicked on Agraf Button"));
        currentLocationTV.setText("51.22, 19.22");
        fastLocationProvider = new FastLocationProvider(getActivity());
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        fastLocationProvider.startListen(new TextViewLocationListener(currentLocationTV));
    }

    @Override
    public void onPause() {
        super.onPause();
        fastLocationProvider.shutDown();
    }

    private static class TextViewLocationListener implements LocationListener {

        private TextView textView;
        private Formatter formatter;
        public TextViewLocationListener(TextView textView) {
            this.textView = textView;
            formatter =  new LocationFormatter(textView.getContext());
        }

        @Override
        public void onLocationChanged(Location location) {
            textView.setText(formatter.format(location));
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

    private static class ShowToastClickListener implements View.OnClickListener{
        private String message;

        public ShowToastClickListener(String message) {
            this.message = message;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }
}

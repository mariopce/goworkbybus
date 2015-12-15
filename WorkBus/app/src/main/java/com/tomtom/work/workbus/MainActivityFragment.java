package com.tomtom.work.workbus;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.tomtom.work.workbus.location.TextViewLocationListener;

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

}

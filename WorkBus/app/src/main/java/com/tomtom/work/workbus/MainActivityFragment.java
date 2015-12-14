package com.tomtom.work.workbus;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button agrafButton;
    private TextView currentLocationTV;

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
        return rootView;
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

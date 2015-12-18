package com.tomtom.work.workbus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;
import com.tomtom.work.workbus.bus.BusProvider;
import com.tomtom.work.workbus.bus.RoutesResponseEvent;
import com.tomtom.work.workbus.map.MapHandler;
import com.tomtom.work.workbus.network.ConnectionService;

public class MainActivity extends AppCompatActivity {


    Bus bus = BusProvider.getDefaultBus();
    private MainActivityFragment mainFragment;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        startService(new Intent(this, ConnectionService.class));
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        bus.register(this);
        mainFragment =  new MainActivityFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, mainFragment).commit();

    }

    @Override
    protected void onPause() {
        super.onPause();
        bus.unregister(this);
    }

    @Subscribe
    public void onRouteResponseEvent(final RoutesResponseEvent event){
        final ShowRoutesFragment showRoutesFragment =  ShowRoutesFragment.newInstance(event);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, showRoutesFragment)
                .addToBackStack("res")
                .commit();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time =  showRoutesFragment.getChooserFinishTime().or("za 20 min");
                final String message = "Szefie będę " + time +", sorry";
                Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                        .setAction("Wyslij", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Uri smsUri = Uri.parse("tel:");
                                Intent intent = new Intent(Intent.ACTION_VIEW, smsUri);
                                intent.putExtra("sms_body", message);
                                intent.setType("vnd.android-dir/mms-sms");
                                startActivity(intent);
                            }
                        }).show();
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MapHandler.PLACE_PICKER_REQUEST) {
            if (resultCode == RESULT_OK) {
                Place place = PlacePicker.getPlace(data, this);
                String toastMsg = String.format("Place: %s", place.getName());
                mainFragment.setChoosenPlace(place);
            }
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this, ConnectionService.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setSendButtonVisibility(int visible) {
        fab.setVisibility(visible);
    }
}

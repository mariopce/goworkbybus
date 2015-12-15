package com.tomtom.work.workbus;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;

import com.tomtom.work.workbus.formater.Formatter;
import com.tomtom.work.workbus.formater.LocationFormatter;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(manifest = "./src/main/AndroidManifest.xml",constants = BuildConfig.class, sdk = 18)
public class LocationFormatterRoboTest {

    @NonNull
    private Location createLodzLocation() {
        Location lodz = new Location("dummy_provider");
        lodz.setLatitude(51.121d);
        lodz.setLongitude(19.22d);
        return lodz;
    }

    @Test
    public void shouldCorrectlyFormatLocation() throws Exception {
        //Given A Lodz location from dummy provider and location formatter
        Location lodz = createLodzLocation();
        String expected = "Current location 51.12, 19.22";
        Formatter<Location> formatter = new LocationFormatter(RuntimeEnvironment.application);
        //When formatting location
        String result = formatter.format(lodz);
        //Then formatted text
        assertThat(result).isEqualTo(expected);
    }



}
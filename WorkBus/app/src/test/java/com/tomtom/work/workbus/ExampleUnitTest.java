package com.tomtom.work.workbus;

import android.location.Location;

import com.tomtom.work.workbus.formatter.LocationFormatter;

import org.fest.assertions.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.*;
import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@Config(sdk = 18, constants = BuildConfig.class)
@RunWith(RobolectricGradleTestRunner.class)
public class ExampleUnitTest {

    public static final String GPS_PROVIDER = "gps";

    @Test
    public void shouldReturnDefaultStringWhenInputIsNull(){
        //GIVEN formatter and null input
        LocationFormatter formatter = new LocationFormatter(RuntimeEnvironment.application);
        Location location = null;
        String expected = "Current location is unknown";
        //WHEN formatting
        String result = formatter.format(location);
        //THEN default value should be return
        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void shouldCorrectlyFormatLodzLocation(){
        //GIVEN lodz location 51.73423, 19.46333 and location formatter
        String expected = "Current location is 51.73,19.46";
        LocationFormatter formatter = new LocationFormatter(RuntimeEnvironment.application);
        Location input = new Location(GPS_PROVIDER);
        input.setLatitude(51.73423);
        input.setLongitude(19.46333);
        //WHEN formatting
        String result = formatter.format(input);
        //THEN we expect nice message format
        assertThat(result).isEqualTo(expected);

    }
}
package com.tomtom.work.workbus;

import android.content.Context;
import android.location.Location;

import com.tomtom.work.workbus.formatter.Formatter;
import com.tomtom.work.workbus.formatter.LocationFormatter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class LocationFormatterTest {

    @Mock
    Context context;
    @Mock
    Location lodz;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        when(context.getString(anyInt())).thenReturn("Current location %.2f, %.2f");
        when(lodz.getLatitude()).thenReturn(51.12);
        when(lodz.getLongitude()).thenReturn(19.22);
    }

    @Test
    public void shouldCorrectlyFormatLocationWithoutRobo() throws Exception {
        //Given A Lodz location from dummy provider and location formatter

        String expected = "Current location 51.12, 19.22";
        Formatter<Location> formatter = new LocationFormatter(context);
        //When formatting location
        String result = formatter.format(lodz);
        //Then formatted text
        assertThat(result).isEqualTo(expected);
    }
}
package com.tomtom.work.workbus.integration;

import android.location.Location;
import android.support.annotation.NonNull;

import com.tomtom.work.workbus.BuildConfig;
import com.tomtom.work.workbus.formatter.Formatter;
import com.tomtom.work.workbus.formatter.LocationFormatter;
import com.tomtom.work.workbus.network.TransitartRequester;
import com.tomtom.work.workbus.network.TransitartService;
import com.tomtom.work.workbus.route.req.From;
import com.tomtom.work.workbus.route.req.Route;
import com.tomtom.work.workbus.route.req.To;
import com.tomtom.work.workbus.route.respons.Routes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import rx.Observable;

import static org.fest.assertions.api.Assertions.assertThat;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(manifest = "./src/main/AndroidManifest.xml",constants = BuildConfig.class, sdk = 18)
public class TransitartServiceRoboTest {

    @Test(timeout = 5000)
    public void shouldCorrectlyFormatLocation() throws Exception {
        //Given A Service with request.
        TransitartRequester requester = new TransitartRequester(RuntimeEnvironment.application);
        TransitartService service =  requester.setupInterface(TransitartService.class);
        //When request
        Route route  = new Route();
        From from = new From();
        from.setLat("51.777745");
        from.setLng("19.382514");
        route.setFrom(from);
        To to = new To();
        to.setLat("51.760204");
        to.setLng("19.462814");
        route.setTo(to);
        route.setDateTime("17-12-2015 10:00");
        route.setRoutingType("OPTIMAL");
        route.setWheelchairAccessibleTripsOnly(false);
        Observable<Routes> response = service.getDeparture(route);
        //Then chcek response
        Routes routes =  response.toBlocking().first();
        assertThat(routes.getRoutesList()).isNotEmpty();

    }

}
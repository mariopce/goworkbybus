package com.tomtom.work.workbus;

import com.tomtom.work.workbus.location.Locations;
import com.tomtom.work.workbus.network.TransitartRequester;
import com.tomtom.work.workbus.network.TransitartService;
import com.tomtom.work.workbus.route.req.From;
import com.tomtom.work.workbus.route.req.Route;
import com.tomtom.work.workbus.route.req.To;
import com.tomtom.work.workbus.route.respons.FinishTime;
import com.tomtom.work.workbus.route.respons.Routes;
import com.tomtom.work.workbus.time.DataProvider;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import rx.Observable;
import rx.Observer;
import timber.log.Timber;

import static org.mockito.Mockito.when;

public class TransitartRequesterTest {


    private TransitartService service;

    @Mock
    DataProvider dataProvider;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        TransitartRequester requester = new TransitartRequester();
        service = requester.setupInterface(TransitartService.class);
        when(dataProvider.getCurrentTimeInEuroFormat()).thenReturn("22-12-2015 15:32");
        Timber.plant(new Timber.DebugTree());
    }

    @Test
    public void shouldTestMyRouteFromMyHome(){
        Route route = new Route();
        From from = new From();
        from.setLat("51.777745");
        from.setLng("19.382514");
        route.setFrom(from);

        To to = new To();
        to.setLat("51.760482");
        to.setLng("19.462449");
        route.setTo(to);
        route.setRoutingType("OPTIMAL");
        route.withDateTime(dataProvider.getCurrentTimeInEuroFormat());

        route.setWheelchairAccessibleTripsOnly(false);

        Observable<Routes> respone = service.getDeparture(route);
        Routes first = respone.toBlocking().first();
        FinishTime finishTime = first.getRoutesList().get(0).getFinishTime();
        System.out.print("ft " + finishTime);

        Assertions.assertThat(finishTime.getHour()).isLessThanOrEqualTo(16);
        Assertions.assertThat(finishTime.getMinute()).isLessThan(55);

    }
}

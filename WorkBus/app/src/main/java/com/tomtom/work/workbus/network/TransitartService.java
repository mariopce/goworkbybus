package com.tomtom.work.workbus.network;


import com.tomtom.work.workbus.route.req.Route;
import com.tomtom.work.workbus.route.respons.Routes;

import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

public interface TransitartService {

    @POST("/router/departure?key=lodz")
    Observable<Routes> getDeparture(@Body Route route);
}

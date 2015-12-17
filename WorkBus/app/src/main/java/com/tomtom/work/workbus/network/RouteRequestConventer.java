package com.tomtom.work.workbus.network;

import com.google.common.base.Converter;

import com.tomtom.work.workbus.bus.RoadRequestEvent;
import com.tomtom.work.workbus.route.req.From;
import com.tomtom.work.workbus.route.req.Route;
import com.tomtom.work.workbus.route.req.To;

public class RouteRequestConventer extends Converter<RoadRequestEvent, Route> {

    public static final String DEFAULT_ROUTING_TYPE = "OPTIMAL";

    public String locationToString(double d){
        return String.valueOf(d);
    }
    @Override
    protected Route doForward(RoadRequestEvent e) {
        From from = new From().withLat(locationToString(e.getFrom().getLatitude())).withLng(locationToString(e.getFrom().getLongitude()));
        To to = new To().withLat(locationToString(e.getTo().getLatitude())).withLng(locationToString(e.getTo().getLongitude()));
        return new Route().withFrom(from).withTo(to).withDateTime(e.getWhen()).withRoutingType(DEFAULT_ROUTING_TYPE).withWheelchairAccessibleTripsOnly(false);
    }

    @Override
    protected RoadRequestEvent doBackward(Route route) {
        return null;
    }
}

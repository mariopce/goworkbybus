package com.tomtom.work.workbus.route;

import com.tomtom.work.workbus.route.respons.RoutesList;

import java.util.ArrayList;
import java.util.List;

public class RouteResponseEvent {

    private List<RoutesList> routes;

    public RouteResponseEvent(List<RoutesList> routes) {
        this.routes = new ArrayList<>(routes);
    }

    public List<RoutesList> getRoutes() {
        return routes;
    }
}

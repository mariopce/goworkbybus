package com.tomtom.work.workbus.bus;

import com.tomtom.work.workbus.route.respons.RoutesList;

import java.io.Serializable;
import java.util.List;

public class RoutesResponseEvent implements Serializable{

    private List<RoutesList> routesLists;

    public RoutesResponseEvent(List<RoutesList> routesLists) {
        this.routesLists = routesLists;
    }

    public List<RoutesList> getRoutesLists() {
        return routesLists;
    }
}

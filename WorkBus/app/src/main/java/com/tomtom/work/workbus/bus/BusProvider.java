package com.tomtom.work.workbus.bus;

import com.squareup.otto.Bus;

public class BusProvider {

    private static final Bus DEFAULT_BUS = new Bus();

    public static Bus getDefaultBus() {
        return DEFAULT_BUS;
    }
}

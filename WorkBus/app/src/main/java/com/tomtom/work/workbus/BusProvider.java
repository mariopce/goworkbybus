package com.tomtom.work.workbus;

import com.squareup.otto.Bus;

public class BusProvider {

    private static final Bus INSTANCE = new Bus();

    private BusProvider() {
    }

    public static Bus getDefault(){
        return INSTANCE;
    }

}

package com.tomtom.work.workbus.formatter;

import android.location.Location;

public interface Formatter<T> {

    String format(T input);
}

package com.tomtom.work.workbus.time;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

public class RealDataProvider implements DataProvider {

    public static final String TIME_FORMAT = "dd-MM-yyyy HH:mm";

    @Override
    public LocalDateTime getNow() {
        return LocalDateTime.now(DateTimeZone.getDefault());
    }

    @Override
    public String getCurrentTimeInEuroFormat() {
        return DateTimeFormat.forPattern(TIME_FORMAT).print(getNow());
    }
}

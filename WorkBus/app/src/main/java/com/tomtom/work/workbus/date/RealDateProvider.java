package com.tomtom.work.workbus.date;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

public class RealDateProvider implements DateProvider {

    public static final String CURRENT_EURO_TIME_FORMAT = "dd-MM-yyyy hh:mm";

    public LocalDateTime getNow(){
        return LocalDateTime.now(DateTimeZone.getDefault());
    }
    public String getNowInEuroFormat() {
        return DateTimeFormat.forPattern(CURRENT_EURO_TIME_FORMAT).print(getNow());
    }
}

package com.tomtom.work.workbus.date;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

public interface DateProvider {
    public LocalDateTime getNow();
    public String getNowInEuroFormat();
}

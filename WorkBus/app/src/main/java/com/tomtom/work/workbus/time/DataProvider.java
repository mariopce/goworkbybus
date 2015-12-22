package com.tomtom.work.workbus.time;

import org.joda.time.LocalDateTime;

public interface DataProvider {

    public LocalDateTime getNow();
    String getCurrentTimeInEuroFormat();
}

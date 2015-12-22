package com.tomtom.work.workbus;

import android.app.Application;
import android.content.Intent;

import timber.log.Timber;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        startService(new Intent(this, InternetService.class));
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        stopService(new Intent(this, InternetService.class));
    }
}

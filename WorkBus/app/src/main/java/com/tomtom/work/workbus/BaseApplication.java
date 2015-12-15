package com.tomtom.work.workbus;

import android.app.Application;
import android.os.StrictMode;

import timber.log.Timber;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                                               .detectDiskReads()
                                               .detectDiskWrites()
                                               .detectNetwork()   // or .detectAll() for all detectable problems
                                               .penaltyLog()
                                               .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                                           .detectLeakedSqlLiteObjects()
                                           .detectLeakedClosableObjects()
                                           .penaltyLog()
                                           .penaltyDeath()
                                           .build());
        }
        Timber.plant(new Timber.DebugTree());
    }
}

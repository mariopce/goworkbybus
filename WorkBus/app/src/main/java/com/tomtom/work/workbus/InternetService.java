package com.tomtom.work.workbus;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class InternetService extends Service {


    public InternetService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}

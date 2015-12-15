package com.tomtom.work.workbus;

import android.view.View;
import android.widget.Toast;

import timber.log.Timber;

class ShowToastClickListener implements View.OnClickListener{

    private String message;

    public ShowToastClickListener(String message) {
        this.message = message;
    }

    @Override
    public void onClick(View v) {
        Timber.d(message);
        Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}

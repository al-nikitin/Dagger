package com.appshop162.dagger.car;

import android.util.Log;

import com.appshop162.dagger.car.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}

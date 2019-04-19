package com.appshop162.dagger.dagger;

import com.appshop162.dagger.MainActivity;
import com.appshop162.dagger.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    // Constructor injection
    Car getCar();

    // Field injection
    void inject(MainActivity mainActivity);
}

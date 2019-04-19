package com.appshop162.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appshop162.dagger.car.Car;
import com.appshop162.dagger.dagger.CarComponent;
import com.appshop162.dagger.dagger.DaggerCarComponent;
import com.appshop162.dagger.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    private Car car;
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();

//        car = component.getCar();
        component.inject(this);

        car.drive();
    }
}

package com.appshop162.dagger.dagger;

import com.appshop162.dagger.car.Engine;
import com.appshop162.dagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

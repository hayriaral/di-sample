package com.aralapps.android.study.disample.engine

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}
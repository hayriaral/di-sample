package com.aralapps.android.study.disample.engine

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(horsePower: Int) {

    val _horsePower = horsePower

    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(_horsePower)
    }
}
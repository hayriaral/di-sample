package com.aralapps.android.study.disample.engine

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(private val horsePower: Int) {

    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

    @Provides
    fun provideHorsePower(): Int{
        return horsePower
    }
}
package com.aralapps.android.study.disample

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWHeels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}
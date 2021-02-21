package com.aralapps.android.study.disample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}
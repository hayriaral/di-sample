package com.aralapps.android.study.disample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
 class DriverModule(private val driverName : String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(driverName)
    }

/*    @Module
    companion object {
        @Provides
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }*/
}
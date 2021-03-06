package com.aralapps.android.study.disample

import com.aralapps.android.study.disample.engine.DieselEngineModule
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    // This is called factory method.
    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule : DriverModule): AppComponent
    }
}
package com.aralapps.android.study.disample

import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver
}
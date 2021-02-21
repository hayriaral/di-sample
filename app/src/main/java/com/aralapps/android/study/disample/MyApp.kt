package com.aralapps.android.study.disample

import android.app.Application

class MyApp : Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.factory().create(DriverModule("Hayri"))
    }

    fun getAppComponent(): AppComponent = component
}
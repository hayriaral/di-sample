package com.aralapps.android.study.disample

import android.app.Application

class MyApp : Application() {
    private lateinit var component: CarComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerCarComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .build()
    }

    fun getAppComponent(): CarComponent = component
}
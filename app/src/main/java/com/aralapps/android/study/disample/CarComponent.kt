package com.aralapps.android.study.disample

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}
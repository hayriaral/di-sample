package com.aralapps.android.study.disample

import com.aralapps.android.study.disample.engine.DieselEngineModule
import com.aralapps.android.study.disample.engine.PetrolEngineModule
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}
package com.aralapps.android.study.disample

import com.aralapps.android.study.disample.engine.DieselEngineModule
import com.aralapps.android.study.disample.engine.PetrolEngineModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(horsePower: Int): Builder

        fun build(): CarComponent
    }
}
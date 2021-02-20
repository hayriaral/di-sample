package com.aralapps.android.study.disample

import com.aralapps.android.study.disample.engine.DieselEngineModule
import com.aralapps.android.study.disample.engine.PetrolEngineModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("Horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("Engine capacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}
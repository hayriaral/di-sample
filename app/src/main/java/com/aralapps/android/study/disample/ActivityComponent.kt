package com.aralapps.android.study.disample

import com.aralapps.android.study.disample.engine.DieselEngineModule
import com.aralapps.android.study.disample.engine.PetrolEngineModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("Horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("Engine capacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent
    }
}
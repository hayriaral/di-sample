package com.aralapps.android.study.disample

import com.aralapps.android.study.disample.engine.PetrolEngineModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("Horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("Engine capacity") engineCapacity: Int): Builder

        // If you take full responsibly with Component.Builder: You need to declare this
        // setter method. Otherwise it will be created automatically by Dagger.
        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent
    }
}
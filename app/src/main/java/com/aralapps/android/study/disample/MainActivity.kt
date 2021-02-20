package com.aralapps.android.study.disample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aralapps.android.study.disample.engine.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()
        component.inject(this)
        car.drive()
    }
}
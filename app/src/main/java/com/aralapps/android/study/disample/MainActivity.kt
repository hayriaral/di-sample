package com.aralapps.android.study.disample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aralapps.android.study.disample.engine.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = (application as MyApp).getAppComponent()
        component.inject(this)
        car1.drive()
        car2.drive()
    }
}
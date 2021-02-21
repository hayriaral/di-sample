package com.aralapps.android.study.disample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: ActivityComponent = DaggerActivityComponent.builder()
            .horsePower(250)
            .engineCapacity(1400)
            .appComponent(((application as MyApp)).getAppComponent())
            .build()
        component.inject(this)
        car1.drive()
        car2.drive()
    }
}
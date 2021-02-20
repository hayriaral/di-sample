package com.aralapps.android.study.disample.engine

import android.util.Log
import javax.inject.Inject


class DieselEngine constructor(horsePower: Int) : Engine {

    val _horsePower = horsePower

    override fun start() {
        Log.d(TAG, "Diesel engine started. Horsepower: $_horsePower")
    }

    companion object {
        private const val TAG = "Car"
    }
}
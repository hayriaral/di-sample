package com.aralapps.android.study.disample.engine

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d(TAG, "Diesel engine started. Horsepower: $horsePower")
    }

    companion object {
        private const val TAG = "Car"
    }
}
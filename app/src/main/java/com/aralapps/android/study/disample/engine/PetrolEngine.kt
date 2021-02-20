package com.aralapps.android.study.disample.engine

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d(TAG, "Petrol engine started. Horsepower: $horsePower")
    }

    companion object {
        private const val TAG = "Car"
    }
}
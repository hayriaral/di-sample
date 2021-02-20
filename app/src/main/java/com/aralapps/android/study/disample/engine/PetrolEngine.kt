package com.aralapps.android.study.disample.engine

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("Horse power") private val horsePower: Int,
    @Named("Engine capacity") private val engineCapacity: Int
) : Engine {

    override fun start() {
        Log.d(
            TAG,
            "Petrol engine started. " +
                    "\n Horsepower: $horsePower" +
                    "\n EngineCapacity: $engineCapacity"
        )
    }

    companion object {
        private const val TAG = "Car"
    }
}
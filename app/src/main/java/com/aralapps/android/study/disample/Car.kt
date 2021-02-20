package com.aralapps.android.study.disample

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine, private val wheels: Wheels
) {
    fun drive() {
        Log.d(TAG, "driving")
    }

    companion object {
        private const val TAG = "Car"
    }
}
package com.aralapps.android.study.disample

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected.")
    }

    companion object {
        private const val TAG = "Car"
    }
}
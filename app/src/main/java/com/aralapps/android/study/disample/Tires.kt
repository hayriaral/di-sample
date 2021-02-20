package com.aralapps.android.study.disample

import android.util.Log

/**
 * Assume that we don't own [Tires] class so we can't annotate it with @Inject constructor.
 */
class Tires {
    fun inflate() {
        Log.d(TAG, "Tires inflated.")
    }

    companion object {
        private const val TAG = "Car"
    }
}

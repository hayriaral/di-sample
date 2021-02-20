package com.aralapps.android.study.disample

import android.util.Log
import com.aralapps.android.study.disample.engine.Engine
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine, private val wheels: Wheels
) {
    fun drive() {
        engine.start()
        Log.d(TAG, "driving")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    companion object {
        private const val TAG = "Car"
    }
}
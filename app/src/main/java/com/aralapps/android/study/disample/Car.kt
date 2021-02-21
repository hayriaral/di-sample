package com.aralapps.android.study.disample

import android.util.Log
import com.aralapps.android.study.disample.engine.Engine
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels,
    private val driver: Driver
) {
    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    companion object {
        private const val TAG = "Car"
    }
}
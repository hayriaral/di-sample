package com.aralapps.android.study.disample

import dagger.Component

@Component
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}
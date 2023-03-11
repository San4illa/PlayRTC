package com.example.playrtc

import android.app.Application
import timber.log.Timber

class PlayRTCApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}

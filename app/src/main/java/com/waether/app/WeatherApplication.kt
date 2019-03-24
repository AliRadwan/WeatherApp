package com.waether.app

import android.app.Application
import com.example.usecases.Domain
import com.waether.app.core.activitiesLifecycleCallbacks

class WeatherApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(activitiesLifecycleCallbacks)
        Domain.integratwith(this)
    }
}
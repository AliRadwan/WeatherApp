package com.example.usecases

import android.app.Application
import android.arch.lifecycle.MutableLiveData

internal val applicationLiveData = MutableLiveData<Application>()

internal fun <T> MutableLiveData<T>.getApplication() :T{
    return this.value!!
}
object Domain{

    fun integratwith(application: Application){
        applicationLiveData.value = application


    }
}
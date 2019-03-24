package com.waether.app.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.usecases.numberIncrementer

const val DEFAULT_VALUE = 0

class RandomizerViewModel(
    val useCase : (MutableLiveData<Int>) -> Unit = { numberLiveData ->  numberIncrementer(numberLiveData)}
) : ViewModel() {

    val numberLiveData = MutableLiveData<Int>()

    init {
        numberLiveData.value = DEFAULT_VALUE
    }

    fun incrementNumber(){
        useCase(numberLiveData)
    }

}
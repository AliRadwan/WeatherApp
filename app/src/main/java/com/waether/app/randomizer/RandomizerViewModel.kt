package com.waether.app.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.usecases.numberIncrementer

private const val DEFAULT_VALUE = 0

class RandomizerViewModel : ViewModel(){


    val numberLiveData = MutableLiveData<Int>()

    init {
        numberLiveData.value = DEFAULT_VALUE
    }

    fun incrementNumber(){
        numberIncrementer(numberLiveData)
    }


}

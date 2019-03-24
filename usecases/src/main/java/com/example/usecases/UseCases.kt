package com.example.usecases

import android.arch.lifecycle.MutableLiveData
import com.example.usecases.repository.CitiesRepositry
import com.example.usecases.repository.citiesRepository
import com.weather.entities.City

fun numberIncrementer(liveData: MutableLiveData<Int>, incrementBy: Int = 1) {
    val oldValue = liveData.value ?: 0
    liveData.postValue(oldValue + incrementBy)
}




// useCase 1: search city by name
// if is searching, then  do not trigger action
// if all is ok, trigger search


fun searchCityByName(
    searchName: String?,
    searching: MutableLiveData<Boolean>,
    result: MutableLiveData<List<City>>,
    repositry: CitiesRepositry = citiesRepository)

{

    searchName
        ?.takeUnless { searching.value?:false }

        ?.also { searching.postValue(true) }

}





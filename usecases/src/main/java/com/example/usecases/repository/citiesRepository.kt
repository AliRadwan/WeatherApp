package com.example.usecases.repository

import com.example.usecases.database.WeatherDatabase
import com.example.usecases.database.weatherDatabase
import com.weather.entities.City
import com.weather.entities.FavoriteCityId

val citiesRepository by lazy { CitiesRepositry() }
class CitiesRepositry(private val database: Lazy<WeatherDatabase> = lazy {weatherDatabase}) {

    fun searchCitiesByName(name: String) = database.value.citiesDao.queryCitiesByName(name)

    fun retrieveFavoritetCitiesID() = database.value.favoritesDao.queryAll()

    fun retrieveCitiesByIds(cityIds: List<Long>) = database.value.citiesDao.queryCitiesByIds(cityIds)


    fun addFavoritesCityId(favoriteCityId: FavoriteCityId)=database.value.favoritesDao.insert(favoriteCityId)

    fun remnveFavoriteCityID(favoriteCityId: FavoriteCityId) =database.value.favoritesDao.delete(favoriteCityId)

}

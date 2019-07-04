package com.example.foxapptest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.foxapptest.favorites.model.*

class HandlerDB {

    fun saveFavorite(favoriteModel: FavoriteModel){

    }

    fun deleteFavorite(favoriteModel: FavoriteModel){

    }

    fun findFavorite(favoriteSearch: FavoriteModel) : LiveData<FavoriteModel>?{


        return MutableLiveData()
    }

    fun count():Int{
        return 0
    }
}
package com.example.foxapptest

import android.app.Application
import com.example.foxapptest.dagger.DaggerFavoritesComponent
import com.example.foxapptest.dagger.FavoritesComponent
import com.example.foxapptest.dagger.FavoritesModule

class FoxAppTestApplication: Application() {

    companion object {
        var INSTANCE:FoxAppTestApplication?=null
    }

    private var favoriteComponent:FavoritesComponent?=null


    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }

    override fun onTerminate() {
        super.onTerminate()
        INSTANCE = null
    }

    fun getFavoriteComponent(): FavoritesComponent{
        if(null != favoriteComponent)
            favoriteComponent = DaggerFavoritesComponent.builder().favoritesModule(FavoritesModule(this)).build()
        return favoriteComponent!!
    }


}
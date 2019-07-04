package com.example.foxapptest.dagger

import android.app.Application
import androidx.room.Room
import com.example.foxapptest.favorites.room.FavoriteDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FavoritesModule(private val application:Application)  {

    @Provides
    @Singleton
    fun providerFavoriteDatabase():FavoriteDatabase{
        return Room.databaseBuilder(application.applicationContext,
            FavoriteDatabase::class.java,
            "database_favorites").fallbackToDestructiveMigration().build()
    }
}
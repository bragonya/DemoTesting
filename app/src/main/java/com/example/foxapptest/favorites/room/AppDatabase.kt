package com.example.foxapptest.favorites.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.foxapptest.favorites.model.FavoriteModel

@Database(entities = [FavoriteModel::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
}
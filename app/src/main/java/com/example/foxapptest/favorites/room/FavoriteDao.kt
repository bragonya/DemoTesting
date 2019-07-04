package com.example.foxapptest.favorites.room

import android.arch.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.foxapptest.favorites.model.FavoriteModel

@Dao
interface FavoriteDao {
    @Query("SELECT * FROM favorites")
    fun getAll():LiveData<List<FavoriteModel>?>

    @Query("SELECT * FROM favorites WHERE id like :id")
    fun findById(id:String):LiveData<FavoriteModel?>

    @Delete
    fun deleteFavorite(favorite:FavoriteModel)

    @Insert
    fun addFavorite(favorite: FavoriteModel)




}
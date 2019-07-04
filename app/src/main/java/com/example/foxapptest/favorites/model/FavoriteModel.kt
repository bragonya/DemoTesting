package com.example.foxapptest.favorites.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteModel (
    @PrimaryKey var id : String,
    var title : String,
    var description : String,
    var image : String
)
package com.example.foxapptest

import org.junit.Test

import org.junit.Assert.*
import com.example.foxapptest.favorites.model.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    private val handlerDb = HandlerDB()

    @Test
    fun shouldReturnNullWhenDontFindAItem (){

        val favorite = FavoriteModel("", "", "", "")

        assertNull(handlerDb.findFavorite(favorite));

    }

    @Test
    fun shouldIncreaseFavoriteListWhenANewItemIsAdded(){



    }


}

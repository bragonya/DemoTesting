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

    /*@Test
    fun shouldReturnNullWhenDontFindAItem (){

        val favorite = FavoriteModel("", "", "", "")

        assertNull(handlerDb.findFavorite(favorite))

    }*/

    @Test
    fun should_Increase_Favorite_List_When_A_New_Item_Is_Added(){


        //Given logged-in user on the Home Screen


        //When the user adds a new Item in the Favorites list
        val count = handlerDb.count()
        val favorite = FavoriteModel("Toy storie 4", "Toy storie", "1001", "url")
        handlerDb.saveFavorite(favorite)


        //Then the favorite list should increase in 1
        assertEquals(count + 1, handlerDb.count())

    }

    @Test
    fun should_Decrease_Favorite_List_When_A_New_Item_Is_Deleted(){

        //Given logged-in user on the Home Screen and a content was added to the favorite list
        val favorite = FavoriteModel("Toy storie 4", "Toy storie", "1001", "url")
        handlerDb.saveFavorite(favorite)


        //When the user delete a Item from the Favorites list
        val count = handlerDb.count()
        handlerDb.deleteFavorite(favorite)

        //Then the favorite list should decrease in 1
        assertEquals(count - 1, handlerDb.count())

    }

    @Test
    fun shoul_dReturn_Null_If_a_Item_Is_Deleted_And_This_Item_Dont_Exist(){

        //Given logged-in user on the Home Screen

        //When the user delete a Item from the Favorites list and this item don't exist

        //Then delete a favorite action should return null
        val favorite = FavoriteModel("", "", "", "")
        assertNull(handlerDb.deleteFavorite(favorite))

    }






}

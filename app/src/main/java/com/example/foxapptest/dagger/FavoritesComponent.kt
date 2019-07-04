package com.example.foxapptest.dagger

import com.example.foxapptest.HandlerDB
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FavoritesModule::class])
interface FavoritesComponent {
    fun inject(handlerDB: HandlerDB)
}
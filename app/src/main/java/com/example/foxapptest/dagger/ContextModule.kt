package com.example.foxapptest.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(val application:Application) {

    @Provides
    fun provideContext():Context{
        return application
    }
}
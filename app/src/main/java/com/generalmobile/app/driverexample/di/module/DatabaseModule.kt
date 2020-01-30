package com.generalmobile.app.driverexample.di.module

import androidx.room.Room
import android.content.Context
import com.generalmobile.app.driverexample.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun getDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context,
                AppDatabase::class.java, "example-db").build()
    }

}
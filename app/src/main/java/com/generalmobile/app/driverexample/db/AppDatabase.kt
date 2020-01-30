package com.generalmobile.app.driverexample.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.generalmobile.app.driverexample.db.dao.ExampleDao
import com.generalmobile.app.driverexample.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}
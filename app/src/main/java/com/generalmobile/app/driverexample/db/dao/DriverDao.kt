package com.generalmobile.app.driverexample.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.generalmobile.app.driverexample.db.entities.DriverEntity

@Dao
interface DriverDao {

    @Query("Select * from DriverEntity")
    fun getDrivers(): LiveData<DriverEntity>

    @Delete
    fun delete(entity: DriverEntity)
}
package com.generalmobile.app.driverexample.service

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface driverApi {

    @GET("drivers")
    fun getDrivers():Observable<DriverListResponse>

    @GET("driverDetail/{id}")
    fun getDetay(@Path("id")id : Int):Observable<DriverDetay>
}
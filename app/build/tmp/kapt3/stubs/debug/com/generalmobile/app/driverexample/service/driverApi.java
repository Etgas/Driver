package com.generalmobile.app.driverexample.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/generalmobile/app/driverexample/service/driverApi;", "", "getDetay", "Lio/reactivex/Observable;", "Lcom/generalmobile/app/driverexample/service/DriverDetay;", "id", "", "getDrivers", "Lcom/generalmobile/app/driverexample/service/DriverListResponse;", "app_debug"})
public abstract interface driverApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drivers")
    public abstract io.reactivex.Observable<com.generalmobile.app.driverexample.service.DriverListResponse> getDrivers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "driverDetail/{id}")
    public abstract io.reactivex.Observable<com.generalmobile.app.driverexample.service.DriverDetay> getDetay(@retrofit2.http.Path(value = "id")
    int id);
}
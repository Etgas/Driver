package com.generalmobile.app.driverexample.ui.drivers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/generalmobile/app/driverexample/ui/drivers/DriverViewModel;", "Lcom/generalmobile/app/driverexample/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "baseApi", "Lcom/generalmobile/app/driverexample/service/driverApi;", "getBaseApi", "()Lcom/generalmobile/app/driverexample/service/driverApi;", "setBaseApi", "(Lcom/generalmobile/app/driverexample/service/driverApi;)V", "liste", "Landroidx/databinding/ObservableField;", "Lcom/generalmobile/app/driverexample/service/DriverListResponse;", "getListe", "()Landroidx/databinding/ObservableField;", "setListe", "(Landroidx/databinding/ObservableField;)V", "getDrivers", "Lio/reactivex/Observable;", "app_debug"})
public final class DriverViewModel extends com.generalmobile.app.driverexample.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.driverexample.service.driverApi baseApi;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<com.generalmobile.app.driverexample.service.DriverListResponse> liste;
    
    @org.jetbrains.annotations.NotNull()
    public final com.generalmobile.app.driverexample.service.driverApi getBaseApi() {
        return null;
    }
    
    public final void setBaseApi(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.service.driverApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<com.generalmobile.app.driverexample.service.DriverListResponse> getListe() {
        return null;
    }
    
    public final void setListe(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<com.generalmobile.app.driverexample.service.DriverListResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.generalmobile.app.driverexample.service.DriverListResponse> getDrivers() {
        return null;
    }
    
    public DriverViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}
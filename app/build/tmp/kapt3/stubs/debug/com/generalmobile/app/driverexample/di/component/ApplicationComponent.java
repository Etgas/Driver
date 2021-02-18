package com.generalmobile.app.driverexample.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lcom/generalmobile/app/driverexample/di/component/ApplicationComponent;", "", "app", "Lcom/generalmobile/app/driverexample/App;", "context", "Landroid/content/Context;", "inject", "", "driverAdapterViewModel", "Lcom/generalmobile/app/driverexample/ui/adapter/DriverAdapterViewModel;", "dashboardViewModel", "Lcom/generalmobile/app/driverexample/ui/dashboard/DashboardViewModel;", "detayViewModel", "Lcom/generalmobile/app/driverexample/ui/detay/DetayViewModel;", "driverViewModel", "Lcom/generalmobile/app/driverexample/ui/drivers/DriverViewModel;", "mainActivityViewModel", "Lcom/generalmobile/app/driverexample/ui/main/MainActivityViewModel;", "mainFragmentViewModel", "Lcom/generalmobile/app/driverexample/ui/movie/MainFragmentViewModel;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Component(modules = {com.generalmobile.app.driverexample.di.module.ApplicationModule.class, com.generalmobile.app.driverexample.di.module.NetModule.class, com.generalmobile.app.driverexample.di.module.DatabaseModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.generalmobile.app.driverexample.App app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences preferences();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.ui.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.ui.dashboard.DashboardViewModel dashboardViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.ui.adapter.DriverAdapterViewModel driverAdapterViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.ui.detay.DetayViewModel detayViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.ui.drivers.DriverViewModel driverViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.driverexample.ui.movie.MainFragmentViewModel mainFragmentViewModel);
}
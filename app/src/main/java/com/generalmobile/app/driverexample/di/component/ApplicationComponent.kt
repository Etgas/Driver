package com.generalmobile.app.driverexample.di.component

import android.content.Context
import android.content.SharedPreferences
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.di.module.ApplicationModule
import com.generalmobile.app.driverexample.di.module.DatabaseModule
import com.generalmobile.app.driverexample.ui.main.MainActivityViewModel

import com.generalmobile.app.driverexample.di.module.NetModule
import com.generalmobile.app.driverexample.ui.adapter.DriverAdapterViewModel
import com.generalmobile.app.driverexample.ui.dashboard.DashboardViewModel
import com.generalmobile.app.driverexample.ui.detay.DetayViewModel
import com.generalmobile.app.driverexample.ui.drivers.DriverViewModel

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)

    fun inject(dashboardViewModel: DashboardViewModel)

    fun inject(driverAdapterViewModel: DriverAdapterViewModel)

    fun inject(detayViewModel: DetayViewModel)

    fun inject(driverViewModel: DriverViewModel)
}

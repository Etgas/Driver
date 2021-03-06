package com.generalmobile.app.driverexample

import com.generalmobile.app.driverexample.di.component.DaggerApplicationComponent
import com.generalmobile.app.driverexample.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}


package com.generalmobile.app.driverexample.ui.dashboard

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import com.generalmobile.app.driverexample.service.DriverDetay

class DashboardViewModel(app : Application):BaseViewModel(app) {


    init {
        (app as? App)?.component?.inject(this)
    }
}
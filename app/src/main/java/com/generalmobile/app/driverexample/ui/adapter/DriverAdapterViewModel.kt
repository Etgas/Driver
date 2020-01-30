package com.generalmobile.app.driverexample.ui.adapter

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import com.generalmobile.app.driverexample.service.DriverList

class DriverAdapterViewModel(app : Application):BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }

    var item = ObservableField<DriverList?>()
}
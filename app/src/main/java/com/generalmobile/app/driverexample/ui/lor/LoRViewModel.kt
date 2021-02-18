package com.generalmobile.app.driverexample.ui.lor

import android.app.Application
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel

class LoRViewModel(app: Application) : BaseViewModel(app) {
    init {
        (app as? App)?.component?.inject(this)
    }
}
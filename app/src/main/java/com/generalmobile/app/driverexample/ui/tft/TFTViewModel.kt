package com.generalmobile.app.driverexample.ui.tft

import android.app.Application
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel

class TFTViewModel(app: Application) : BaseViewModel(app) {
    init {
        (app as? App)?.component?.inject(this)
    }
}
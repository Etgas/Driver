package com.generalmobile.app.driverexample.ui.drivers

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import com.generalmobile.app.driverexample.service.DriverListResponse
import com.generalmobile.app.driverexample.service.driverApi
import io.reactivex.Observable
import javax.inject.Inject

class DriverViewModel(app : Application):BaseViewModel(app) {

    @Inject
    lateinit var baseApi:driverApi
var liste:ObservableField<DriverListResponse> = ObservableField()
    init {
        (app as? App)?.component?.inject(this)
    }

    fun getDrivers():Observable<DriverListResponse>{
return baseApi.getDrivers()
    }
}
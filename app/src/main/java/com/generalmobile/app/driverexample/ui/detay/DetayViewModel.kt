package com.generalmobile.app.driverexample.ui.detay

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import com.generalmobile.app.driverexample.service.DriverDetay
import com.generalmobile.app.driverexample.service.driverApi
import io.reactivex.Observable
import javax.inject.Inject

class DetayViewModel(app : Application):BaseViewModel(app) {

    @Inject
    lateinit var baseApi : driverApi

    var liste:ObservableField<DriverDetay> = ObservableField()

    init {
        (app as? App)?.component?.inject(this)
    }

    fun getDetay(id:Int):Observable<DriverDetay>{
        return baseApi.getDetay(id = id)
    }
}
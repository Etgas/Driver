package com.generalmobile.app.driverexample.ui.LoL

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import com.generalmobile.app.driverexample.service.response.SummonerResponse
import io.reactivex.Observable

class LoLViewModel(app: Application) : BaseViewModel(app) {
    init {
        (app as? App)?.component?.inject(this)
    }

    var items: ObservableField<SummonerResponse> = ObservableField()

    fun getSummonerInfos(name: String): Observable<SummonerResponse> {
        return baseApi.getSummoner(name)
    }
}
package com.generalmobile.app.driverexample.ui.LoL.challengers

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import com.generalmobile.app.driverexample.service.response.ChallengerResponse
import io.reactivex.Observable

class ChallengersViewModel(app: Application) : BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }

    var list: ObservableField<List<ChallengerResponse>> = ObservableField()

    fun getChallengers(queue: String): Observable<List<ChallengerResponse>> {

        return baseApi.getChallengers(queue)

    }
}
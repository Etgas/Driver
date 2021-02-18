package com.generalmobile.app.driverexample.ui.LoL.adapter

import androidx.databinding.ObservableField
import com.generalmobile.app.driverexample.service.response.ChallengerResponse

class LoLChallengerAdapterViewModel(val callback: (ChallengerResponse) -> Unit) {
    val model = ObservableField<ChallengerResponse>()
}
package com.generalmobile.app.driverexample.core

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.generalmobile.app.driverexample.db.AppDatabase
import com.generalmobile.app.driverexample.service.riotApi
import javax.inject.Inject

open class BaseViewModel(app: Application) : AndroidViewModel(app) {
    @Inject
    lateinit var db: AppDatabase

    @Inject
    lateinit var baseApi: riotApi
}

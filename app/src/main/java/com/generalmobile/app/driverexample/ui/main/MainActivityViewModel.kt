package com.generalmobile.app.driverexample.ui.main

import android.app.Application
import com.generalmobile.app.driverexample.db.AppDatabase
import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.App
import com.generalmobile.app.driverexample.core.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    // private var examples: LiveData<List<Example>>? = null

    @Inject
    lateinit var db: AppDatabase

    init {
        (app as? App)?.component?.inject(this)
    }

    fun getAppName() = getApplication<Application>().resources.getString(R.string.app_name)

    /* Example Usage Of LiveData
    fun getExamples(): LiveData<List<Example>> {
        if (examples == null) {
            examples = MutableLiveData<List<Note>>()
            loadExamples()
        }

        return examples!!;
    }

    private fun loadExamples() {
        examples = db.exampleDao().getExamples()
    }
    */

}
package com.generalmobile.app.driverexample.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseActivity
import com.generalmobile.app.driverexample.databinding.ActivityDashboardBinding
import com.generalmobile.app.driverexample.ui.adapter.DriverAdapter

class DashboardActivity : BaseActivity<DashboardViewModel,ActivityDashboardBinding>(DashboardViewModel::class.java) {
    override fun getLayoutRes() = R.layout.activity_dashboard

    override fun initViewModel(viewModel: DashboardViewModel) {
        binding.viewModel = viewModel

    }

    

}

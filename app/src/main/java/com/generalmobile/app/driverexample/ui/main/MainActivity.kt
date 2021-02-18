package com.generalmobile.app.driverexample.ui.main

import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseActivity
import com.generalmobile.app.driverexample.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {

    override fun getLayoutRes() = R.layout.activity_main
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel

        setupNavigation()
    }

    private fun setupNavigation() {
        val navController = findNavController(R.id.mainFragment)
        setupActionBarWithNavController(navController)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val navController = findNavController(R.id.mainFragment)
        if(navController.currentDestination?.id != item?.itemId)
            NavigationUI.onNavDestinationSelected(item!!,navController)
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.mainFragment).navigateUp()



    }



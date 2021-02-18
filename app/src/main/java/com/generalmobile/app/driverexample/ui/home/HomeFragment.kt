package com.generalmobile.app.driverexample.ui.home

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(HomeViewModel::class.java) {
    override fun getLayoutRes() = R.layout.fragment_home

    override fun initViewModel() {
        mBinding.viewModel = viewModel
    }
}
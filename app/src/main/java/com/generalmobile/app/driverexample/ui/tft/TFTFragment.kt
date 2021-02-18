package com.generalmobile.app.driverexample.ui.tft

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentTftBinding

class TFTFragment : BaseFragment<TFTViewModel, FragmentTftBinding>(TFTViewModel::class.java) {
    override fun getLayoutRes() = R.layout.fragment_tft

    override fun initViewModel() {
        mBinding.viewModel = viewModel
    }
}
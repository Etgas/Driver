package com.generalmobile.app.driverexample.ui.lor

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentLorBinding

class LoRFragment : BaseFragment<LoRViewModel, FragmentLorBinding>(LoRViewModel::class.java) {
    override fun getLayoutRes() = R.layout.fragment_lor


    override fun initViewModel() {
        mBinding.viewModel = viewModel
    }
}
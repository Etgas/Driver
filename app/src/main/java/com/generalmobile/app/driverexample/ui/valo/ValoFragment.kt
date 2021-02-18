package com.generalmobile.app.driverexample.ui.valo

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentValoBinding

class ValoFragment : BaseFragment<ValoViewModel, FragmentValoBinding>(ValoViewModel::class.java) {
    override fun getLayoutRes() = R.layout.fragment_valo

    override fun initViewModel() {
        mBinding.viewModel = viewModel
    }
}
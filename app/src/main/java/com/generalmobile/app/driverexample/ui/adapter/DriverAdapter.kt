package com.generalmobile.app.driverexample.ui.adapter


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseAdapter
import com.generalmobile.app.driverexample.databinding.FragmentDriverAdapterBinding
import com.generalmobile.app.driverexample.service.DriverList

/**
 * A simple [Fragment] subclass.
 */
class DriverAdapter(private val callBack:(DriverList?) -> Unit) : BaseAdapter<DriverList>(diffcallBack) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {

        val mBinding = DataBindingUtil.inflate<FragmentDriverAdapterBinding>(
                LayoutInflater.from(parent.context),
                R.layout.fragment_driver_adapter,
                parent,
                false
        )
val viewModel = DriverAdapterViewModel((parent.context as Activity).application)

        mBinding.viewModel = viewModel
        mBinding.driverAdapterList.setOnClickListener {
        mBinding.viewModel?.item?.get().let {
            callBack(it)
        }
        }
return mBinding
    }

    override fun bind(binding: ViewDataBinding, position: Int) {

        (binding as? FragmentDriverAdapterBinding)?.viewModel?.item?.set(getItem(position))
binding.executePendingBindings()

    }


}

val diffcallBack = object : DiffUtil.ItemCallback<DriverList>(){
    override fun areItemsTheSame(oldItem: DriverList, newItem: DriverList): Boolean =
            oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: DriverList, newItem: DriverList): Boolean =
            oldItem == newItem


}
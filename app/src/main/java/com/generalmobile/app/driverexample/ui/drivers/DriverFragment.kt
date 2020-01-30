package com.generalmobile.app.driverexample.ui.drivers


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentDriverBinding
import com.generalmobile.app.driverexample.service.DriverList
import com.generalmobile.app.driverexample.service.DriverListResponse
import com.generalmobile.app.driverexample.ui.adapter.DriverAdapter
import com.generalmobile.app.driverexample.utils.service.CallbackWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class DriverFragment : BaseFragment<DriverViewModel,FragmentDriverBinding>(DriverViewModel::class.java) {

    private val disposable = CompositeDisposable()
    private var list = mutableListOf<DriverList?>()
    override fun getLayoutRes() = R.layout.fragment_driver

    override fun initViewModel() {
    mBinding.viewModel = viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getListe()
    }

    private fun getListe() {

        list.clear()

        val adapter = DriverAdapter{

            val bundle = Bundle()
            bundle.putInt("id",it?.id ?:-1)
            findNavController().navigate(R.id.detayFragment,bundle)

        }
            mBinding.driverList.adapter = adapter
            mBinding.driverList.layoutManager =
LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        disposable.add(with(viewModel){

            getDrivers()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(object:CallbackWrapper<DriverListResponse>(activity?.application){
                        override fun onSuccess(t: DriverListResponse) {
                            viewModel.liste.set(t)
                        }

                        override fun onComplete() {
                            viewModel.liste.get()?.items?.forEach {
                            list.add(it)
                            }
                            (mBinding.driverList.adapter as DriverAdapter).submitList(list)
                        }

                        override fun onError(e: Throwable) {
                            Timber.e(e)
                        }
                    })
        })
    }


}

 package com.generalmobile.app.driverexample.ui.detay


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentDetayBinding
import com.generalmobile.app.driverexample.service.DriverDetay
import com.generalmobile.app.driverexample.utils.service.CallbackWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

 /**
 * A simple [Fragment] subclass.
 */
class DetayFragment : BaseFragment<DetayViewModel,FragmentDetayBinding>(DetayViewModel::class.java) {
     val disposable = CompositeDisposable()
     override fun getLayoutRes() = R.layout.fragment_detay

     override fun initViewModel() {
    mBinding.viewModel= viewModel
     }

     override fun init() {
         mBinding.viewModel = viewModel
         mBinding.lifecycleOwner = this
val id =arguments?.getInt("id")?:-1
getDetay(id)
     }

     private fun getDetay(id: Int) {
mBinding.viewModel?.let {
disposable.add(it.getDetay(id)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(object :CallbackWrapper<DriverDetay>(activity?.application){
            override fun onSuccess(t: DriverDetay) {
mBinding.viewModel?.liste?.set(t)
            }

            override fun onError(e: Throwable) {
                Timber.e(e)
            }

        })
)
}
     }


 }

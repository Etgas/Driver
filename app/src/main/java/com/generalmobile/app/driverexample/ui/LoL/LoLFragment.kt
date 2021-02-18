package com.generalmobile.app.driverexample.ui.LoL

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentLolBinding
import com.generalmobile.app.driverexample.service.response.SummonerResponse
import com.generalmobile.app.driverexample.utils.service.CallbackWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable

class LoLFragment : BaseFragment<LoLViewModel, FragmentLolBinding>(LoLViewModel::class.java) {
    private var summonerName: String = ""
    private val disposable = CompositeDisposable()
    override fun getLayoutRes() = R.layout.fragment_lol

    override fun initViewModel() {
        mBinding.viewModel = viewModel
    }

    override fun init() {
        super.init()
        searchSummoner()
    }

    private fun searchSummoner() {
        summonerName = mBinding.editTextSummoner.text.toString()

        mBinding.viewModel.let {
            disposable.add(it.getSummonerInfos(summonerName)
                    .subscribeOn(io.reactivex.schedulers.Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(object : CallbackWrapper<SummonerResponse>(activity?.application) {
                        override fun onSuccess(t: SummonerResponse) {
                            mBinding.viewModel.items.set(t)
                        }

                        override fun onComplete() {
                            super.onComplete()

                        }

                    })
            )
        }
    }
}
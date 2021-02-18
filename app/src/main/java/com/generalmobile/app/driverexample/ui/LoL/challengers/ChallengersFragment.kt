package com.generalmobile.app.driverexample.ui.LoL.challengers

import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseFragment
import com.generalmobile.app.driverexample.databinding.FragmentChallengersBinding
import com.generalmobile.app.driverexample.service.response.ChallengerResponse
import com.generalmobile.app.driverexample.ui.LoL.adapter.LoLChallengerAdapter
import com.generalmobile.app.driverexample.utils.service.CallbackWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ChallengersFragment : BaseFragment<ChallengersViewModel, FragmentChallengersBinding>(ChallengersViewModel::class.java) {
    val disposable = CompositeDisposable()
    private val challengers = mutableListOf<ChallengerResponse>()
    private val queue: String = "RANKED_SOLO_5x5"

    override fun getLayoutRes() = R.layout.fragment_challengers

    override fun initViewModel() {
        mBinding.viewModel = viewModel
    }

    override fun init() {
        super.init()
        initAdapter()
    }

    private fun initAdapter() {
        mBinding.RVChallengers.adapter = LoLChallengerAdapter {
            mBinding.RVChallengers.isNestedScrollingEnabled = false
            fillAdapter()
        }
    }

    private fun fillAdapter() {
        mBinding.viewModel?.let {
            disposable.add(it.getChallengers(queue)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(object : CallbackWrapper<List<ChallengerResponse>>(activity?.application) {
                        override fun onSuccess(t: List<ChallengerResponse>) {
                            mBinding.viewModel?.list?.set(t)
                        }

                        override fun onComplete() {
                            super.onComplete()
                        }


                    }
                    ))


        }
    }
}

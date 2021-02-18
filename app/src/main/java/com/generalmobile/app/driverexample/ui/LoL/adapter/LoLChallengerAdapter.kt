package com.generalmobile.app.driverexample.ui.LoL.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.generalmobile.app.driverexample.R
import com.generalmobile.app.driverexample.core.BaseAdapter
import com.generalmobile.app.driverexample.databinding.ItemChallengersBinding
import com.generalmobile.app.driverexample.service.response.ChallengerResponse

class LoLChallengerAdapter(val callback: (ChallengerResponse) -> Unit) :
        BaseAdapter<ChallengerResponse>(object : DiffUtil.ItemCallback<ChallengerResponse>() {
            override fun areItemsTheSame(oldItem: ChallengerResponse, newItem: ChallengerResponse): Boolean {
                return oldItem.summonerId == newItem.summonerId
            }

            override fun areContentsTheSame(oldItem: ChallengerResponse, newItem: ChallengerResponse): Boolean {
                return oldItem == newItem
            }
        }) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        val binding = DataBindingUtil.inflate<ItemChallengersBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_challengers,
                parent,
                false
        )
        return binding

    }

    override fun bind(binding: ViewDataBinding, position: Int) {
        (binding as ItemChallengersBinding).viewModel?.model?.set(getItem(position))
        binding.executePendingBindings()
    }
}

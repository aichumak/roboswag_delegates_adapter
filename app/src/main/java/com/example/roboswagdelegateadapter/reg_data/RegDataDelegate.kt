package com.example.roboswagdelegateadapter.reg_data

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.roboswagdelegateadapter.databinding.ViewholderRegistrationDataBinding
import ru.touchin.roboswag.recyclerview_adapters.adapters.ItemAdapterDelegate

class RegDataDelegate(
    private val addAction: () -> Unit
) : ItemAdapterDelegate<RegDataViewHolder, RegDataModel>() {

    override fun onCreateViewHolder(parent: ViewGroup): RegDataViewHolder {
        val binding = ViewholderRegistrationDataBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RegDataViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: RegDataViewHolder,
        item: RegDataModel,
        adapterPosition: Int,
        collectionPosition: Int,
        payloads: MutableList<Any>
    ) {
        holder.bind(item)
        holder.itemView.setOnClickListener {
            addAction.invoke()
        }
    }
}
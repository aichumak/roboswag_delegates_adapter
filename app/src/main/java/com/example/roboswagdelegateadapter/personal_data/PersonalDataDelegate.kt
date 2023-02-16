package com.example.roboswagdelegateadapter.personal_data

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.roboswagdelegateadapter.BaseItem
import com.example.roboswagdelegateadapter.databinding.ViewholderPersonalDataBinding
import ru.touchin.roboswag.recyclerview_adapters.adapters.ItemAdapterDelegate

class PersonalDataDelegate(
    private val addAction: () -> Unit
) : ItemAdapterDelegate<PersonalDataViewHolder, PersonalDataModel>() {

    override fun onCreateViewHolder(parent: ViewGroup): PersonalDataViewHolder {
        val binding = ViewholderPersonalDataBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PersonalDataViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: PersonalDataViewHolder,
        item: PersonalDataModel,
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
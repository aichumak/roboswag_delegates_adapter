package com.example.roboswagdelegateadapter.personal_data

import androidx.recyclerview.widget.RecyclerView
import com.example.roboswagdelegateadapter.BaseItem
import com.example.roboswagdelegateadapter.databinding.ViewholderPersonalDataBinding

class PersonalDataViewHolder(private val binding: ViewholderPersonalDataBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: BaseItem) {
        val personalData = item as PersonalDataModel
        binding.apply {
            personalDataTitle.text = "Test title"
            userId.text = personalData.userId
            initials.text = personalData.initials
            holderName.text = personalData.holderName
        }
    }
}

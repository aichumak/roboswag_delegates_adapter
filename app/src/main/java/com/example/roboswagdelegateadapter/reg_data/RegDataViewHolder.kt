package com.example.roboswagdelegateadapter.reg_data

import androidx.recyclerview.widget.RecyclerView
import com.example.roboswagdelegateadapter.BaseItem
import com.example.roboswagdelegateadapter.databinding.ViewholderRegistrationDataBinding

class RegDataViewHolder(private val binding: ViewholderRegistrationDataBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: BaseItem) {
        val regData = item as RegDataModel
        binding.apply {
            regDataTitle.text = "Test title"
            regUserId.text = regData.userId
            regInitials.text = regData.initials
        }
    }
}

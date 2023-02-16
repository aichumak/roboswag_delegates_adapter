package com.example.roboswagdelegateadapter

import androidx.recyclerview.widget.DiffUtil
import com.example.roboswagdelegateadapter.personal_data.PersonalDataModel

class BaseItemDiffCallBack : DiffUtil.ItemCallback<PersonalDataModel>() {
    override fun areItemsTheSame(oldItem: PersonalDataModel, newItem: PersonalDataModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: PersonalDataModel,
        newItem: PersonalDataModel
    ): Boolean {
        return oldItem == newItem
    }
}

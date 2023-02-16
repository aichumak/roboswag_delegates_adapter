package com.example.roboswagdelegateadapter

import androidx.recyclerview.widget.DiffUtil

class BaseItemDiffCallBack : DiffUtil.ItemCallback<BaseItem>() {
    override fun areItemsTheSame(oldItem: BaseItem, newItem: BaseItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: BaseItem,
        newItem: BaseItem
    ): Boolean {
        return oldItem == newItem
    }
}

package com.example.roboswagdelegateadapter.reg_data

import com.example.roboswagdelegateadapter.BaseItem

data class RegDataModel(
    override val id: Int,
    var userId: String,
    var initials: String,
) : BaseItem()

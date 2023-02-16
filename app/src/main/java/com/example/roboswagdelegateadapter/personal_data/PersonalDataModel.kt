package com.example.roboswagdelegateadapter.personal_data

import com.example.roboswagdelegateadapter.BaseItem

data class PersonalDataModel(
    override val id: Int,
    val holderName: String,
    var userId: String,
    var initials: String,
) : BaseItem()

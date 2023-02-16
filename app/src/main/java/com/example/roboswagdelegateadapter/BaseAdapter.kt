package com.example.roboswagdelegateadapter

import com.example.roboswagdelegateadapter.personal_data.PersonalDataModel
import ru.touchin.roboswag.recyclerview_adapters.adapters.AdapterDelegate
import ru.touchin.roboswag.recyclerview_adapters.adapters.DelegationListAdapter

class BaseAdapter : DelegationListAdapter<BaseItem>(BaseItemDiffCallBack()) {

    fun addNewDelegate(delegate: AdapterDelegate<*>) {
        addDelegate(delegate)
    }

    fun removeExistDelegate(delegate: AdapterDelegate<*>) {
        removeDelegate(delegate)
    }
}
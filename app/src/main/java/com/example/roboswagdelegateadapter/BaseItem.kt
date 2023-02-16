package com.example.roboswagdelegateadapter

/**base interface for implementation in all models
 * @author Chumak. A*/
abstract class BaseItem {

    abstract val id: Int

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BaseItem

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}

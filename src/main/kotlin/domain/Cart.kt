package domain

import java.io.Serializable
import java.util.UUID

data class Cart(var id: UUID? = null, val items: MutableList<Item>) : Serializable {

    init {
        id = UUID.randomUUID()
    }

    private val removedItems: MutableList<String> = mutableListOf()

    fun removeItem(item: Item) {
        items.remove(item)
        removedItems.add(item.product.name)
    }

    fun getRemovedItems(): List<String> {
        return removedItems
    }
}

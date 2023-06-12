package domain

import java.util.UUID

data class Cart(var id: UUID? = null, val items: MutableList<Item>) {

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

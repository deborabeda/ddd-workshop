package domain

import java.util.UUID

data class Cart(var id: UUID? = null, val items: MutableList<Item>) {

    private var status = CartStatus.IN_PROGRESS

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

    fun checkOut(): Order {
        this.status = CartStatus.CHECKED_OUT
        val mutableList = mutableListOf<Product>()
        items.forEach {
            for (i in 1..it.quantity) {
                mutableList.add(it.product)
            }
        }

        return Order(mutableList)
    }
}

enum class CartStatus {
    IN_PROGRESS, CHECKED_OUT
}

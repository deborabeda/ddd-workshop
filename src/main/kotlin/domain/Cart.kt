package domain

data class Cart(val items: MutableList<Item>) {

    private val removedItems: MutableList<String> = mutableListOf()

    fun removeItem(item: Item) {
        items.remove(item);
        removedItems.add(item.product.name)
    }

    fun getRemovedItems(): List<String> {
        return removedItems
    }
}

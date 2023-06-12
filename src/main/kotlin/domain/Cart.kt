package domain

data class Cart(val items: MutableList<Item>) {

    //fun quantity(): Map<String, Int> = items.groupingBy { it.product.name }.eachCount()

}

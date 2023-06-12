package domain

data class Cart(val products: MutableList<Product>) {

    fun quantity(): Map<String, Int> = products.groupingBy { it.name }.eachCount()

}

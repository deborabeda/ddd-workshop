package application

import domain.Cart
import domain.Item
import domain.Product

fun main() {
    val cart = Cart(mutableListOf())
    val product = Product("Apple Pencil")
    val product2 = Product("Sony Wireless headphone")
    cart.items.addAll(arrayOf(Item(product, 1), Item(product2, 2)))
    println("Cart = $cart")
    val items: List<Item> = cart.items



    println("----------------------------------------")
    println("products = $items")
    println("----------------------------------------")
}
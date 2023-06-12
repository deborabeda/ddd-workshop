package application

import domain.Cart
import domain.Item
import domain.Product

fun main() {
    val cart = Cart(mutableListOf())
    val product = Product("Apple Pencil")
    val product2 = Product("Sony Wireless headphone")
    val product3 = Product("Sony Wireless headphone new")

    cart.items.addAll(arrayOf(Item(product, 1), Item(product2, 2), Item(product3, 1)))

    cart.items.remove(Item(product3, 1))
    println("Cart = $cart")
    val items: List<Item> = cart.items

    println("----------------------------------------")
    println("products = $items")
    println("----------------------------------------")
}
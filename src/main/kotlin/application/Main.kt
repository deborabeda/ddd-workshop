package application

import domain.Cart
import domain.Item
import domain.Product

fun main() {
    val cart = Cart(mutableListOf())
    val product = Product("Apple Pencil")
    val product2 = Product("Sony Wireless headphone")
    val product3 = Product("Sony Wireless headphone new")

    val item1 = Item(product, 1)
    val item2 = Item(product2, 2)
    val item3 = Item(product3, 1)
    
    cart.items.addAll(arrayOf(item1, item2, item3))
    cart.removeItem(item3)
    println("Cart = $cart")
    
    val items: List<Item> = cart.items
    println("----------------------------------------")
    println("products = $items")
    println("removed products = ${cart.getRemovedItems()}")
    println("----------------------------------------")
}
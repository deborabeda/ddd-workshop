package application

import domain.Cart
import domain.Product

fun main() {
    val cart = Cart(mutableListOf())
    val product = Product("Apple Pencil")
    val product2 = Product("Sony Wireless headphone")
    val product3 = Product("Apple Pencil")
    cart.products.addAll(arrayOf(product, product2, product3))
    println("Cart = $cart")
    val products: List<Product> = cart.products

    println(cart.quantity())


    println("----------------------------------------")
    println("products = $products")
    println("----------------------------------------")
}
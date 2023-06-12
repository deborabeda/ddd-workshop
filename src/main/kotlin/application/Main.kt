package application

import domain.Cart
import domain.Product

fun main() {
    val cart = Cart(mutableListOf())
    val product = Product("Apple Pencil")
    val product2 = Product("Sony Wireless headphone")
    cart.products.addAll(arrayOf(product, product2))
    println("Cart = $cart")
    val products: List<Product> = cart.products


    println("----------------------------------------")
    println("products = $products")
    println("----------------------------------------")
}
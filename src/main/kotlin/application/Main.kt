package application

import domain.Cart
import domain.Product

fun main() {
    val cart = Cart(mutableListOf())
    val product = Product("Apple Pencil")
    cart.products.add(product)
    println("Cart = $cart")
    val products: List<Product> = cart.products


    println("----------------------------------------")
    println("products = $products")
    println("----------------------------------------")
}
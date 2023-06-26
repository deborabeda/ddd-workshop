package ecomerce.application

import ecomerce.application.domain.*
import java.math.BigDecimal

fun main() {
   val discountService = DiscountService()

   val cart = Cart(items = mutableListOf())
   val product = Product("Apple Pencil", Price(BigDecimal(121), Currency.USD), 100)
   val product2 = Product("Sony Wireless headphone", Price(BigDecimal(256), Currency.USD), 100)
   val product3 = Product("Sony Wireless headphone new", Price(BigDecimal(256), Currency.USD), 100)

   val item1 = Item(discountService.applyDiscount(product), 1)
   val item2 = Item(discountService.applyDiscount(product2), 2)
   val item3 = Item(discountService.applyDiscount(product3), 1)

   cart.items.addAll(arrayOf(item1, item2, item3))
   cart.removeItem(item3)
   println("Cart = $cart")

   val items: List<Item> = cart.items
   println("----------------------------------------")
   println("products = $items")
   println("removed products = ${cart.getRemovedItems()}")
   println("----------------------------------------")

   val order = cart.checkOut()


   println("order = $order")
}
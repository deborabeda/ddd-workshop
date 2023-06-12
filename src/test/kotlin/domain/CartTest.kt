package domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CartTest {

    @Test
    fun shouldAddToCart() {
        val cart = Cart(mutableListOf())
        val product = Product("Some test product")
        cart.products.add(product)

        val actual = cart.products

        assertEquals(1, actual.size)
        assertEquals("Some test product", actual[0].name)
    }

    @Test
    fun shouldGetRightQuantity(){
        val cart = Cart(mutableListOf())
        val product = Product("Some test product")
        val product1 = Product("Some test product")
        cart.products.add(product)
        cart.products.add(product1)

        val actual = cart.quantity()

        assertEquals(2, actual["Some test product"])
    }
}
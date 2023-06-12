package domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CartTest {

    @Test
    fun shouldAddToCart() {
        val cart = Cart(mutableListOf())
        val product = Product("Some test product")
        cart.items.add(Item(product, 1))

        val actual = cart.items

        assertEquals(1, actual.size)
        assertEquals("Some test product", actual[0].product.name)
    }

    @Test
    fun shouldGetRightQuantity(){
        val cart = Cart(mutableListOf())
        val product = Product("Some test product")
        cart.items.add(Item(product, 2))
        val actual = cart.items

        assertEquals(2, actual[0].quantity)
    }

    @Test
    fun shouldRemoveAProductFromCart(){
        val cart = Cart(mutableListOf())
        val product = Product("Some test product")

        cart.items.add(Item(product, 2))

        cart.removeItem(Item(product, 2))
        val actual = cart.items

        assertEquals(actual, mutableListOf<Item>())
        assertEquals(listOf("Some test product"), cart.getRemovedItems())
    }
}
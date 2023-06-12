package domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class CartTest {

    @Test
    fun shouldAddToCart() {
        val cart = Cart(items = mutableListOf())
        val product = Product("Some test product", Price(BigDecimal(256), Currency.USD))
        cart.items.add(Item(product, 1))

        val actual = cart.items

        assertEquals(1, actual.size)
        assertEquals("Some test product", actual[0].product.name)
    }

    @Test
    fun shouldGetRightQuantity() {
        val cart = Cart(items = mutableListOf())
        val product = Product("Some test product", Price(BigDecimal(256), Currency.USD))
        cart.items.add(Item(product, 2))
        val actual = cart.items

        assertEquals(2, actual[0].quantity)
    }

    @Test
    fun shouldRemoveAProductFromCart() {
        val cart = Cart(items = mutableListOf())
        val product = Product("Some test product", Price(BigDecimal(256), Currency.USD))

        cart.items.add(Item(product, 2))

        cart.removeItem(Item(product, 2))
        val actual = cart.items

        assertEquals(actual, mutableListOf<Item>())
        assertEquals(listOf("Some test product"), cart.getRemovedItems())
    }

    @Test
    fun shouldBeAbleToDifferentiateBetweenSimilarCarts() {

        val cart = Cart(items = mutableListOf())
        val item = Item(Product("Some test product", Price(BigDecimal(256), Currency.USD)), 2)

        cart.items.add(item)

        val cart2 = Cart(items = mutableListOf())

        cart2.items.add(item)

        assertNotEquals(cart, cart2)
    }
}
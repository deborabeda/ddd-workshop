package domain

import java.math.BigDecimal

class DiscountService {

    val DISCOUNT_PERCENTAGE = 10

    fun applyDiscount(product: Product): Product {
        val competitorPrice: Price? = CompetitorProducts.products[product.name]

        return competitorPrice?.let { price ->
            val amount = price.amount
            Product(
                product.name,
                Price(amount.subtract(amount.divide(BigDecimal(DISCOUNT_PERCENTAGE))), Currency.USD)
            )
        } ?: product
    }
}
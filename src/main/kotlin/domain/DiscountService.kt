package domain

import java.math.BigDecimal

class DiscountService {

    val DISCOUNT_PERCENTAGE = 10

    fun applyDiscount(product: Product) : Product {
        val competitorProducts = CompetitorProducts.products.filter{ it.key === product.name }.toList()

        if(competitorProducts.isNotEmpty()) {
            val competitorProduct = competitorProducts.first()
            val amount = competitorProduct.second.amount

            return Product(
                    competitorProduct.first,
                    Price(amount.subtract(amount.divide(BigDecimal(DISCOUNT_PERCENTAGE))), Currency.USD))
        }

        return product
    }
}
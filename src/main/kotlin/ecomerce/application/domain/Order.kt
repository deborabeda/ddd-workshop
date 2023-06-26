package ecomerce.application.domain

import java.math.BigDecimal

data class Order(val products: List<Product>){

    fun totalCost(): Double {
        val costWithoutShipping = products.sumOf { it.price.amount.toInt() }
        val totalShipping = products.sumOf { it.weightInGrams * 0.1 }

        return costWithoutShipping + totalShipping
    }


}

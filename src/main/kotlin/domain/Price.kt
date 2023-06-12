package domain

import java.math.BigDecimal

data class Price(val amount: BigDecimal, val currency: Currency)

enum class Currency {
    USD
}
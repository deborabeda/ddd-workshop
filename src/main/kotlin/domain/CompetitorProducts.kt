package domain

import java.math.BigDecimal

object CompetitorProducts {
    val products = mutableMapOf<String, Price>(
        "Apple Pencil" to Price(BigDecimal(121), Currency.USD),
        "Sony Wireless headphone" to Price(BigDecimal(256), Currency.USD)
    )

}
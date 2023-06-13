package bank.domain

import java.util.*

data class Customer(val id: UUID = UUID.randomUUID(), val accounts: List<BankAccount>, var address: Address) {

    fun updateAddress(address: Address) {
        this.address = address
        accounts.forEach { it.updateAddress(address) }
    }
}
package bank.domain

import java.util.*

data class BankAccount(val id: UUID = UUID.randomUUID(), var address: Address) {

    fun updateAddress(address: Address) {
        this.address = address
    }
}

package bank.domain

import java.util.*

//aggregate
data class BankAccount(val id: UUID = UUID.randomUUID(), var address: Address) {

    //should only be accessible through customer
    fun updateAddress(address: Address) {
        this.address = address
    }
}

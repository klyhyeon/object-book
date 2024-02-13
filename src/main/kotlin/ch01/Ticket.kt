package org.example.ch01

class Ticket(
    private var fee: Long,
) {

    fun getFee(): Long {
        return this.fee
    }
}
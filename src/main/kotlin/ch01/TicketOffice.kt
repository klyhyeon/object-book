package org.example.ch01

import java.util.*
import kotlin.collections.ArrayList

class TicketOffice(
    private var amount: Long,
    private var tickets: MutableList<Ticket> = mutableListOf()
) {

    constructor(
        amount: Long,
        vararg tickets: Ticket,
    ): this(
        amount = amount,
    ) {
        this.amount = amount
        this.tickets.addAll(tickets)
    }

    fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}
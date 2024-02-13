package org.example.ch01

class Bag(
    private var amount: Long,
    private var invitation: Invitation?,
) {

    private var ticket: Ticket? = null

    constructor(
        amount: Long,
    ) : this(
        amount = amount,
        invitation = null,
    ) {
        this.amount = amount
    }


    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    fun setTicket(ticket: Ticket?) {
        this.ticket = ticket
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}
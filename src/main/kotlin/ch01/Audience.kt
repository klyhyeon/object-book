package org.example.ch01

class Audience(
    private val bag: Bag?,
) {

    fun getBag(): Bag? {
        return this.bag
    }
}
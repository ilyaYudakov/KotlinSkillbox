package main.kotlin

interface Warrior {
    var isKilled: Boolean
    val miss: Int

    fun getDamage(damage: Int)
}
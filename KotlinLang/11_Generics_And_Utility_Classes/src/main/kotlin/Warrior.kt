interface Warrior {
    val isKilled: Boolean
    val miss: Int

    fun attack(enemy: Warrior)
    fun getDamage(damage: Int)
}
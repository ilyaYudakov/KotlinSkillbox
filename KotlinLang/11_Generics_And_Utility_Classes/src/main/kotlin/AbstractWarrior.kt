abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    abstract val accuracy: Int
    abstract var currentHealth: Int
    abstract val weapon: AbstractWeapon

    override fun attack(enemy: Warrior) {
        if (weapon.isEmptyMagazine) weapon.recharge()
        else weapon.getCartridge().forEach {
            if (accuracy.isChance() && !enemy.miss.isChance()) enemy.getDamage(it.getDamage())
        }
    }
    override fun getDamage(damage: Int) {
        currentHealth -= damage
    }
}

class Captain(override val maxHealth: Int = 150,
              override val accuracy: Int = 60,
              override val weapon: AbstractWeapon = Weapons.createRiffle(),
              override var currentHealth: Int = maxHealth,
              override val miss: Int = 30): AbstractWarrior() {
    override val isKilled: Boolean
        get() = currentHealth <= 0.0
}
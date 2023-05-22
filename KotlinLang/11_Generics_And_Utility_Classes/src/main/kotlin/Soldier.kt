class Soldier(override val maxHealth: Int = 100,
              override val accuracy: Int = 50,
              override val weapon: AbstractWeapon = Weapons.createMachineGun(),
              override var currentHealth: Int = maxHealth,
              override val miss: Int = 20): AbstractWarrior() {
    override val isKilled: Boolean
        get() = currentHealth <= 0.0
}
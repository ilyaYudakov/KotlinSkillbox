class General(override val maxHealth: Int = 200,
              override val accuracy: Int = 80,
              override val weapon: AbstractWeapon = Weapons.createPistol(),
              override var currentHealth: Int = maxHealth,
              override val miss: Int = 10): AbstractWarrior() {
}
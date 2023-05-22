enum class Ammo(private val damage: Int,
                private val criticalDamageChance: Int,
                private val criticalDamageCoefficient: Int) {
    PISTOL_CARTRIDGE(2, 30, 5),
    MACHINE_GUN_CARTRIDGE(2, 20, 4),
    RIFLE_CARTRIDGE(3, 10, 4);
    fun getDamage(): Int{
        val criticalDamage = damage * criticalDamageCoefficient
        return if (criticalDamageChance.isChance()) criticalDamage
        else damage
    }
}
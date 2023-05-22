object Weapons {
    fun createPistol(): AbstractWeapon {
        val pistol = object : AbstractWeapon (6, FireType.SingleShot, Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.PISTOL_CARTRIDGE
            }
        }
        return pistol
    }

    fun createUzi(): AbstractWeapon {
        val uzi = object : AbstractWeapon (4, FireType.BurstFire(2), Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.PISTOL_CARTRIDGE
            }
        }
        return uzi
    }
    fun createMachineGun(): AbstractWeapon {
        val machineGun = object : AbstractWeapon (12, FireType.BurstFire(4), Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.MACHINE_GUN_CARTRIDGE
            }
        }
        return machineGun
    }
    fun createRiffle(): AbstractWeapon {
        val riffle = object : AbstractWeapon (1, FireType.SingleShot, Stack()) {
            override fun createCartridge(): Ammo {
                return Ammo.RIFLE_CARTRIDGE
            }
        }
        return riffle
    }
}
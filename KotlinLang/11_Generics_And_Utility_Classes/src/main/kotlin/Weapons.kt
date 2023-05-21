package main.kotlin

object Weapons {
    val createPistol = object: AbstractWeapon() {
        override val name: String = "Pistol"
        override val maxCartridges: Int = 7
        override val fireType: FireType = FireType.SingleShot
        override fun makeCartridge(): Ammo {
            return Ammo.PISTOL_CARTRIDGE
        }
    }
    val createUzi = object : AbstractWeapon() {
        override val name: String = "Uzi"
        override val maxCartridges: Int = 4
        override val fireType: FireType = FireType.Burst(2)
        override fun makeCartridge(): Ammo {
            return Ammo.PISTOL_CARTRIDGE
        }
    }
    val createMachineGun = object : AbstractWeapon() {
        override val name: String = "Machine Gun"
        override val maxCartridges: Int = 12
        override val fireType: FireType = FireType.Burst(4)
        override fun makeCartridge(): Ammo {
            return Ammo.MACHINE_GUN_CARTRIDGE
        }
    }
    val createRifle = object : AbstractWeapon() {
        override val name: String = "Rifle"
        override val maxCartridges: Int = 1
        override val fireType: FireType = FireType.SingleShot
        override fun makeCartridge(): Ammo {
            return Ammo.RIFLE_CARTRIDGE
        }
    }
}
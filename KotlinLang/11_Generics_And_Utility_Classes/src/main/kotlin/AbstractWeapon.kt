abstract class AbstractWeapon(
    private val maxCartridges: Int,
    private val fireType: FireType,
    private var magazine: Stack<Ammo>
) {
    //    abstract val name: String
    val isEmptyMagazine: Boolean get() = magazine.isEmpty()
    abstract fun createCartridge(): Ammo
    fun recharge() {
        for (i in 1..maxCartridges) {
            magazine.push(createCartridge())
        }
    }

    fun getCartridge(): List<Ammo> {
        val cartridges = mutableListOf<Ammo>()
        val count = if (fireType is FireType.BurstFire) { fireType.size } else { 1 }
        for (i in 1..count) {
            magazine.pop()?.let { cartridges.add(it) }
        }
        return cartridges.toList()
    }
}
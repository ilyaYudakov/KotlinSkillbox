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
        if (fireType is FireType.BurstFire) {
            for (i in 1.. fireType.size) {
                magazine.pop()?.let { cartridges.add(it) }
            }
        } else {
            magazine.pop()?.let { cartridges.add(it) }
        }
        return cartridges.toList()
    }
}
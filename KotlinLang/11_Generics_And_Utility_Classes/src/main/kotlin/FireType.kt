sealed class FireType {
    object  SingleShot: FireType()
    data class BurstFire(val size: Int): FireType()
}
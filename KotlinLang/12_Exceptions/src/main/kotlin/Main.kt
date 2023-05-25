fun main() {
    val wheel = Wheel()
    for (i in -2..110) {
        wheel.push(i.toDouble() / 10)
    }
}
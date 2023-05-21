fun main() {
    val lg = TV("Lg", "first" ,5.0)
    val samsung = TV("Samsung", "F10", 10.0)
    println("Brand is ${lg.brand}, model is ${lg.model}, size is ${lg.size}")
    println("State power is ${lg.isPower}")
    lg.volumeUp()
    lg.switchPower()
    lg.selectChannel()
    lg.switchPower()
    for (i in 1..11) {
        lg.switchChannelUp()
    }
    println("Brand is ${lg.brand}, model is ${lg.model}, size is ${lg.size}")


}
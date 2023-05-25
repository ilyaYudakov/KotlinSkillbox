class Wheel {
    private var pressure = 0.0
    private fun isCheckPressure(atmosph : Double) : Boolean {
        when {
            (atmosph < 0 || atmosph > 10) -> throw IncorrectPressure()
            atmosph < 1.6 -> throw TooLowPressure()
            atmosph > 2.5 -> throw TooHighPressure()
        }
        return true
    }

    fun push(d : Double) {

        try {
            if (isCheckPressure(d)) pressure = d
            println("Set up $d atmospheres")
        } catch (t : Throwable) {
            println("$d ${t.message}")
        }
    }
}



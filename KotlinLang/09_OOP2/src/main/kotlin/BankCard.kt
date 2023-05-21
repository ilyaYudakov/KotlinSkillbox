abstract class BankCard {
    abstract var balance: Int
    open fun income(n: Int) {
        balance += n
        println("Replenishment of the balance for $n rubles.")
    }
    abstract fun pay(n: Int): Boolean
    fun info() {
        println("Your balance is $balance rubles")
    }
    open fun allInfo() {
        println("Your balance is $balance rubles.")
    }
}
package main.kotlin

fun main() {

    var value: Int?
    while (true) {
        print("Please, enter a positive number: ")
        value = readlnOrNull()?.toIntOrNull()
        if (value != null) {
            if (value < 0) {
                println("No positive number, repeat please")
            } else
                break
        }
    }
    fib(value)
}

fun fib(num: Int?) {

    var fn1 = 1L
    var fn2 = 1L

    for (i in 1..num!!) {
        println("index: $i, number: $fn1")

        fn2 += fn1
        fn1 = fn2 - fn1
    }
}
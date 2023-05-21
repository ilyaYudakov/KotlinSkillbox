fun main() {

    println(decodeStr("F2p)v\"y233{0->c}ttelciFc"))

}

fun decodeStr(str: String): String {
    val firstHalf = str.take(str.length / 2)
    val secondHalf = str.takeLast(str.length / 2)
    return "${decodeFirstHalf(firstHalf)}${decodeSecondHalf(secondHalf)}"
}

fun decodeFirstHalf(str: String): String {

    return str.shift(1)
        .replace('5', 's', false)
        .replace('4', 'u', false)
        .shift(-3)
        .replace('0', 'o', false)
}

fun decodeSecondHalf(str: String): String{
    return str.reversed()
        .shift(-4)
        .replace('_', ' ', false)
}

fun String.shift(offset: Int): String = this.map { it + offset }.joinToString ("")

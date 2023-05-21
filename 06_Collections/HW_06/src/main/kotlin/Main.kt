fun main() {
    print("Enter a number of phone numbers: ")
    var n = readlnOrNull()?.toIntOrNull()?: return

    while (n <= 0) {
        println("Input error")
        print("Enter a number of phone numbers: ")
        n = readlnOrNull()?.toIntOrNull()?: return
    }
    val numbers = mutableListOf<String>()
    println()
    val listOfNumbers = fillingList(numbers, n)
    println("\nPhone numbers with +7 - ${listOfNumbers.filter { it.startsWith("+7") }}")
    println("The size of the set of unique phone numbers ${listOfNumbers.toSet().size}")
    println("The sum of unique phone numbers ${listOfNumbers.toSet().sumOf { it.length }}\n")
    val result = fillingMap(listOfNumbers.toSet())
    result.forEach {
        println("Subscriber: ${it.value}. Phone number: ${it.key}")
    }
    //отсортированное по номерам телефона.
    println("\nSorted map by phone numbers")
    val sortedMap = result.toSortedMap()
    sortedMap.forEach {
        println("Subscriber: ${it.value}. Phone number: ${it.key}")
    }
    //отсортированное по имени абонента.
    println("\nSorted map by subscribers")
    sortedMap.entries.sortedBy { it.value }.forEach{
        println("Subscriber: ${it.value}, Phone number: ${it.key}")
    }
}

fun fillingList(list: MutableList<String>, n: Int): List<String> {
    for (i in 0 until n) {
        print("Enter the phone number(${i + 1}): ")
        list.add(readln())
    }
    return list
}

fun fillingMap(set: Set<String>): Map<String, String> {
    val mapOfNumbers = mutableMapOf<String, String>()
    set.forEach {
        println("Enter the name of the person with the phone number: $it")
        mapOfNumbers[it] = readlnOrNull().toString()
    }
    return mapOfNumbers
}

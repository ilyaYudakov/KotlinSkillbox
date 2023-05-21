fun main() {

    val firstName = "ilya"
    val lastName = "Yudakov"
    var height = 1.76
    val weight = 80f
    var isChild = height < 1.5 || weight < 40

    var info = """
        My name is $firstName $lastName
        I'm height is $height meters and weight $weight kilogramm
        I'm ${if (isChild) "child" else "adult"}
    """.trimIndent()
    println(info)

    height = 1.4

    isChild = height < 1.5 || weight < 40

    info = """
        My name is $firstName $lastName
        I'm height is $height meters and weight $weight kilogramm
        I'm ${if (isChild) "child" else "adult"}
    """.trimIndent()

    println(info)


}
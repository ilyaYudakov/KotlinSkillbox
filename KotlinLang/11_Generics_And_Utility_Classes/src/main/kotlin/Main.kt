import kotlin.random.Random

fun main() {
    val firstTeam = Team().createTeam(7)
    val secondTeam = Team().createTeam(7)

    val battle = Battle(firstTeam, secondTeam)
    while (!battle.isGameOver) {
        battle.getCurrentCondition()
        battle.iterate()
    }
    battle.getCurrentCondition()
}

fun Int.isChance(): Boolean {
    return Random.nextInt(100) <= this
}


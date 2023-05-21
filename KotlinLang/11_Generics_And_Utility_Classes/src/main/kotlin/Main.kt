import main.kotlin.Battle
import main.kotlin.Team
import kotlin.random.Random

fun main() {
    var teamFirst = Team()
    var teamSecond = Team()
    teamFirst.filling(5)
    teamSecond.filling(7)
    Battle(teamFirst = teamFirst, teamSecond = teamSecond).iteration()
}

fun Int.chance(): Boolean {
    return if (this in 0..100) {
        when (Random.nextInt(101)) {
            in 1..this -> true
            else -> false
        }
    } else {
        println("Non-compliance with the limit")
        false
    }
}

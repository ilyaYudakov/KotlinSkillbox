package main.kotlin

import kotlin.random.Random

class Team {
    var team = mutableListOf<AbstractWarrior>()

    fun filling(n: Int) {
        for (i in 0..n) {
            when (Random.nextInt(101)) {
                in 1..10 -> team.add(General())
                in 11.. 40 -> team.add(Captain())
                else -> team.add(Soldier())
            }
        }
    }
}
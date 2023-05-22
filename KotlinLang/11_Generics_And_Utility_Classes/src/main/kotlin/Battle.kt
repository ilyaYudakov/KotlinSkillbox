class Battle(private var firstTeam: List<AbstractWarrior>, private var secondTeam: List<AbstractWarrior>) {
    val isGameOver: Boolean
        get() = firstTeam.isEmpty() || secondTeam.isEmpty()

    fun getCurrentCondition() {
        if (firstTeam.isNotEmpty() && secondTeam.isNotEmpty()) println(BattleState.Progress.condition)
        if (firstTeam.isEmpty() && secondTeam.isEmpty()) println(BattleState.Draw.condition)
        if (firstTeam.isNotEmpty() && secondTeam.isEmpty()) println(BattleState.FirstTeamWin.condition)
        if (firstTeam.isEmpty() && secondTeam.isNotEmpty()) println(BattleState.SecondTeamWin.condition)
    }
    fun iterate() {
        firstTeam.forEach { it.attack(secondTeam.random()) }
        secondTeam = secondTeam.filter { !it.isKilled }
        println("Warriors of second Team: ${secondTeam.size}")
        secondTeam.forEach { it.attack(firstTeam.random()) }
        firstTeam = firstTeam.filter { !it.isKilled }
        println("Warriors of first Team: ${firstTeam.size}")

    }
}
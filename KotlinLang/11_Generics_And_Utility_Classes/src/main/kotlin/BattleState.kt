sealed class BattleState(val condition: String) {

    object Progress : BattleState("Battle continue")
    object FirstTeamWin : BattleState("First Team is win")
    object SecondTeamWin : BattleState("Second Team is win")
    object Draw : BattleState("Is Draw")

}
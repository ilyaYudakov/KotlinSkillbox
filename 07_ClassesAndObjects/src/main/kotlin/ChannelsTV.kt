object ChannelsTV {
    private val allChannels = listOf("First", "RT", "TNT", "2x2", "STS", "Sport", "Russia24", "Russia1")
    fun getRandomChannels(): List<String> {
        val all = allChannels.shuffled()
        val ch = mutableListOf<String>()
        for (i in 0..(1..allChannels.lastIndex).random()) {
            ch.add(all[i])
        }
        return ch
    }
}
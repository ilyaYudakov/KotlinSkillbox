class TV(val brand: String, val model: String, val size: Double) {
    var isPower = false
        private set
    private var channels = ChannelsTV.getRandomChannels()
    private var vol = 0
    private var channel = channels[0]

    fun switchPower() {
        if(!isPower) {
            isPower = true
            println("The TV $brand $model is On")
        } else {
            println("The TV $brand $model is Off")
        }
    }

    fun volumeUp() {
        if (!isPower) {
            switchPower()
        } else {
            if (vol == maxVolume) {
                vol = maxVolume
                println("Volume is $maxVolume")
            }
            vol += 1
            println("Volume is $vol")
        }
    }

    fun volumeDown() {
        if (!isPower) {
            switchPower()
        } else {
            if (vol == minVolume) {
                vol = minVolume
                println("Volume is $minVolume")
            }
            vol -= 1
            println("Volume = $vol")
        }
    }

    fun selectChannel() {
        if (!isPower) {
            switchPower()
        }
        print("Select a channel: ")
        var n = readlnOrNull()?.toIntOrNull()?:return
        if (n in 0..channels.lastIndex) {
            channel = channels[n - 1]
            println("${channels.indexOf(channel)  + 1} - \"${channel}\"")
        } else {
            while (n !in 0..channels.lastIndex) {
                print("Select another channel: ")
                n = readlnOrNull()?.toIntOrNull()?: return
            }
            channel = channels[n - 1]
            println("${channels.indexOf(channel) + 1} - \"${channel}\"")
        }
    }

    fun switchChannelUp() {
        if (!isPower) {
            switchPower()
        }
        channel = if (channels.indexOf(channel) == channels.lastIndex) {
            channels[0]
        } else {
            channels[channels.indexOf(channel) + 1]
        }
        println("${channels.indexOf(channel) + 1} - \"${channel}\"")
    }

    fun switchChannelDown() {
        if (!isPower) {
            switchPower()
        }
        channel = if (channels.indexOf(channel) == channels.lastIndex) {
            channels[0]
        } else {
            channels[channels.indexOf(channel) - 1]
        }
        println("${channels.indexOf(channel) + 1} - \"${channel}\"")
    }
    companion object {
        private const val  maxVolume = 10
        private const val minVolume = 0
    }
}
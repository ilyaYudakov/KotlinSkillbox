class Fish(energyArg: Int, weightArg: Int, maxAgeArg: Int, nameArg: String): Animal(energyArg,weightArg,maxAgeArg,nameArg) {
    override fun movement() {
        super.movement()
        println("Swimming")
    }

    override fun birth(): Animal {
        val babyFish = Fish(energyArg = (1..10).random(), weightArg = (1..10).random(), maxAgeArg = maxAge, nameArg = name)
        println("A new fish, $name, was born. His weight is $weight kg, his energy is $energy. The maximum age is $maxAge years")
        return babyFish
    }
}
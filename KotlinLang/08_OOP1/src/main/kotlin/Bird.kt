class Bird(energyArg: Int, weightArg: Int, maxAgeArg: Int, nameArg: String): Animal(energyArg,weightArg,maxAgeArg,nameArg) {

    override fun movement() {
        super.movement()
        println("Flying")
    }

    override fun birth(): Animal {
        val babyBird = Bird(energyArg = (1..10).random(), weightArg = (1..5).random(), maxAgeArg = maxAge, nameArg = name)
        println("A new bird, $name, was born. His $weight kg, his energy is $energy. The maximum age is $maxAge years.")
        return babyBird
    }
}
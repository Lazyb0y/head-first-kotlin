class Dog(val name: String, var weight: Int, breed_param: String) {
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("Dog $name has been created.")
    }

    init {
        println("The breed is $breed.")
    }

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}
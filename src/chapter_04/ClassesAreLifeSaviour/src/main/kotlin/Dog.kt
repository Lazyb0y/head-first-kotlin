class Dog(val name: String, var weight: Int, breed_param: String) {
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}
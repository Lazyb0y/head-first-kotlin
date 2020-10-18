class Dog(val name: String, weight_param: Int, breed_param: String) {
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight / 2.2

    lateinit var temperament: String

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
fun main(args: Array<String>) {
    var myDog = Dog("Fido", 70, "Mixed")
    println("My dog's name is ${myDog.name}.")
    myDog.bark()

    var dogs = arrayOf(
        Dog("Fido", 70, "Mixed"),
        Dog("Ripper", 10, "Poodle")
    )
    println("Total dogs we have: ${dogs.size}")
}
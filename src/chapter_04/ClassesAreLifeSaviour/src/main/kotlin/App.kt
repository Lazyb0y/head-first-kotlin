fun main(args: Array<String>) {
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()

    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")

    myDog.weight = -2
    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    var dogs = arrayOf(
        Dog("Fido", 70, "Mixed"),
        Dog("Ripper", 10, "Poodle")
    )
    println("Total dogs we have: ${dogs.size}")
}
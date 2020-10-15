fun main(args: Array<String>) {
    var x = 3
    val name = "Ahamed"

    x *= 10

    println("x is $x.")

    while (x > 20) {
        x -= 1
        println("x is now $x.")
    }

    for (i in 1..10) {
        x += 1
        println("x is now $x.")
    }

    if (x == 20) {
        println("x must be 20.")
    } else {
        println("x isn't 20.")
    }

    // Ahamed is the boss
    if (name.equals("Ahamed")) {
        println("$name Strike.")
    }
}
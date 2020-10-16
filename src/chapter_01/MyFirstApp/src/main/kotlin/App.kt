fun main(args: Array<String>) {
    codeMagnets()
}

fun someCode() {
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

fun aLoopyExample() {
    var x = 1
    println("Before the loop, x = $x.")

    while (x < 4) {
        println("In the loop, x = $x.")
        x += 1
    }

    println("After the loop, x = $x.")
}

fun conditionalBranching() {
    val x = 3
    val y = 1
    if (x > y) {
        println("x is greater than y")
    } else {
        println("x is not greater than y")
    }

    println("This line runs no matter what")
}

fun ifReturningValue() {
    val x = 3
    val y = 1

    println(if (x > y) "x is greater than y" else "x is not greater than y.")
    println("This line runs no matter what.")
}

fun codeMagnets() {
    var x = 1

    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x += 1
    }

    if (x == 3) {
        println("Do")
    }
}
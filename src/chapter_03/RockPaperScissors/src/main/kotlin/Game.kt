fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    println("Game choice: $gameChoice")

    val userChoice = getUserChoice(options)
    println("User choice: $userChoice")
}

fun getGameChoice(optionsParam: Array<String>): String {
    return optionsParam[(Math.random() * optionsParam.size).toInt()]
}

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        // Ask the user for their choice
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        // Read the user input
        val userInput = readLine()

        // Validate the user input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        // Informing user for invalid input if any
        if (!isValidChoice) {
            println("You must enter a valid choice!")
        }
    }

    return userChoice
}
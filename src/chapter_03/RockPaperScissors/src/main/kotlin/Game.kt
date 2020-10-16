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
    print("Please enter one of the following:")
    for (item in optionsParam) print(" $item")
    println(".")

    val userInput = readLine()
    return userInput.toString()
}
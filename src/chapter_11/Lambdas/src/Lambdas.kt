typealias DoubleConversion = (Double) -> Double

fun convert(x: Double, converter: (Double) -> Double): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {
    val addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts(6, 7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    convert(20.0) { it * 1.8 + 32 }
    convertFive { it * 1.8 + 32 }

    // Define two conversion lambdas
    val kgsToPound = { x: Double -> x * 2.204623 }
    val poundsToUSTones = { x: Double -> x / 2000.0 }

    // Combine the two lambdas to create a new one
    val kgsToUsTones = combine(kgsToPound, poundsToUSTones)

    // Invoke the kgsToUSTones lambda
    var usTones = kgsToUsTones(1000.0)
}
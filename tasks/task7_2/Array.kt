fun main() {
    println("=== Using arrayOf() ===")
    val numbers = arrayOf(9, 6, 3, 2)

    println("Kotlin class: ${numbers::class.qualifiedName}")
    println("JVM class: ${numbers::class.java}")

    println("First element: ${numbers[0]}")
    numbers[1] = 10
    println("Modified array: ${numbers.joinToString()}")

    val slice = numbers.slice(1..2)
    println("Slice 1..2 as list: $slice")

    println("\n=== Using intArrayOf() ===")
    val intNumbers = intArrayOf(9, 6, 3, 2)

    println("Kotlin class: ${intNumbers::class.qualifiedName}")
    println("JVM class: ${intNumbers::class.java}")

    println("First element: ${intNumbers[0]}")
    intNumbers[1] = 10
    println("Modified int array: ${intNumbers.joinToString()}")

    val intSlice = intNumbers.slice(1..2)
    println("Slice 1..2 as list: $intSlice")
}
// Task 8.4.1: experimenting with sequences
fun main() {
    val numbers = listOf(1, 4, 7, 2, 9, 3, 8)
    println("Original list: $numbers")

    val sequenceNumbers = numbers.asSequence()
    println("Sequence created: $sequenceNumbers") 

    val oddNumbersSequence = sequenceNumbers.filter { it % 2 != 0 }
    println("Filtered odd numbers (sequence): $oddNumbersSequence") 

    val squaredOddNumbersSequence = oddNumbersSequence.map { it * it }
    println("Squared odd numbers (sequence): $squaredOddNumbersSequence")

    val result = squaredOddNumbersSequence.toList()
    println("Final result (list of squares of odd numbers): $result")
}

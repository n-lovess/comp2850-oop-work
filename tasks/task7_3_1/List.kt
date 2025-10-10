// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println("Full list: $numbers") 

    println("numbers[0]: ${numbers[0]}")   
    println("numbers.get(0): ${numbers.get(0)}")  

    println("Slice 2..4: ${numbers.slice(2..4)}")

    println("First element: ${numbers.first()}")
    println("Last element: ${numbers.last()}")

    val mutableNumbers = mutableListOf(9, 3, 6, 2)
    println("Mutable list before: $mutableNumbers")

    mutableNumbers[0] = 1
    mutableNumbers.add(5)
    mutableNumbers.add(0, 7)   
    println("Mutable list after modifications: $mutableNumbers")

    mutableNumbers.removeAt(2)   
    mutableNumbers.remove(5)     
    println("Mutable list after removals: $mutableNumbers")
}
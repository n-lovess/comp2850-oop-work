fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println("Initial mutable list: $numbers") 

    println("numbers[0]: ${numbers[0]}")   
    println("numbers.get(0): ${numbers.get(0)}")  

    println("Slice 2..4: ${numbers.slice(2..4)}")

    println("First element: ${numbers.first()}")
    println("Last element: ${numbers.last()}")

    numbers[0] = 10
    println("After numbers[10] = 10: $numbers")

    numbers.add(7)
    println("After numbers.add(7): $numbers")

    numbers.add(0, 1)
    println("After numbers.add(0, 1): $numbers")

    numbers.removeAt(2)
    println("After numbers.removeAt(7): $numbers")

    numbers.remove(5)
    println("After numbers.remove(5): $numbers")

    numbers.clear()
    println("After numbers.clear(): $numbers")
}
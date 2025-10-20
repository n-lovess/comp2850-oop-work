// Task 12.8.1: example of an enum class

import java.util.Scanner

enum class Day {
    Monday, Tuesday, Wednesday, Thursday,
    Friday, Saturday, Sunday
}

fun main() {
    val scanner = Scanner(System.`in`)
    
    println("Enter a day of the week (e.g., Monday):")
    val input = scanner.nextLine()
    
    try {
        val day = Day.valueOf(input)   // Parses string into enum constant
        println("You entered: $day")
    } catch (e: IllegalArgumentException) {
        println("Invalid input. Please enter one of the following days:")
        println(Day.entries.joinToString(", ") { it.name })
    }
}

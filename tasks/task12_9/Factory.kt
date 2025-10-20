// Task 12.9: class implementing the Static Factory Method pattern

import java.time.LocalDate

class Person private constructor(val name: String, val birth: LocalDate) {
    companion object Factory {
        private val names = mutableSetOf<String>()

        fun create(name: String, birth: LocalDate): Person {
            require(name !in names) { "Name must be unique!" }
            names.add(name)
            return Person(name, birth)
        }
    }
}

fun main() {

    val p1 = Person.create("Alice", LocalDate.of(2000, 1, 1))
    println("Created: ${p1.name}, ${p1.birth}")

    try {
        val p2 = Person.create("Alice", LocalDate.of(1995, 5, 5))
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}

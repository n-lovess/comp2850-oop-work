// Task 12.5.4: class with a computed property

import java.time.LocalDate
import java.time.temporal.ChronoUnit.YEARS

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    // Computed property: no backing field, calculated each time it's accessed
    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main() {
    val p = Person("Alice", LocalDate.of(1997, 8, 23))
    println("Name: ${p.name}")
    println("Birth date: ${p.birth}")
    println("Age: ${p.age}")
}

// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    constructor(name: String, birth: String) : this(name, LocalDate.parse(birth))
}

fun main() {
    val p = Person("Alice", "1997-08-23")
    println("Name: ${p.name}")
    println("Birth date: ${p.birth}")
    println("Married: ${p.isMarried}")
}

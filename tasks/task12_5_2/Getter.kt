// Task 12.5.2: class with a custom getter

import java.time.LocalDate

class Person(_name: String, val birth: LocalDate) {

    var isMarried = false

    var name = _name
        get() {
            return field.uppercase()
        }
}

fun main() {
    val p = Person("Alice", LocalDate.of(1997, 8, 23))
    println("Stored name: ${p.name}")   // Should print "ALICE"
}
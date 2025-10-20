// Task 12.5.3: class with a custom setter

import java.time.LocalDate

class Person(_name: String, val birth: LocalDate) {

    var isMarried = false

    var name = _name
        set(value) {
            require(value.isNotBlank()) { "Name cannot be blank" }
            field = value
        }
}

fun main() {
    val p = Person("Alice", LocalDate.of(1997, 8, 23))
    println("Initial name: ${p.name}")

    // This will trigger the custom setter and cause an exception:
    p.name = ""
}

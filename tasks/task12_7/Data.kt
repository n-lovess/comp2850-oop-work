// Task 12.7: data classes vs regular classes

import java.time.LocalDate

data class Person(
    var name: String,
    val birth: LocalDate,
    var isMarried: Boolean = false   
)

fun main() {
    val p1 = Person("Dave", LocalDate.of(1997, 8, 23))
    val p2 = Person("Dave", LocalDate.of(1997, 8, 23))

    println("p1 == p1?     : ${p1 == p1}")   
    println("p1 == p2?     : ${p1 == p2}")   
    println("p1.hashCode() : ${p1.hashCode().toString(16)}")
    println("p2.hashCode() : ${p2.hashCode().toString(16)}")
    println("p1.toString() : $p1")
    println("p2.toString() : $p2")

    p1.isMarried = true
    println("\np1 marries")
    println("p1 == p2?     : ${p1 == p2}")   
    println("p1.hashCode() : ${p1.hashCode().toString(16)}")
    println("p1.toString() : $p1")
}

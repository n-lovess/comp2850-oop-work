import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }

    constructor(name: String, birth: String) : this(name, LocalDate.parse(birth))
}

fun main() {
    print("Enter name: ")
    val name = readln()

    print("Enter date of birth (YYYY-MM-DD): ")
    val birth = readln()

    val p = Person(name, birth)
    println("Name: ${p.name}")
    println("Birth date: ${p.birth}")
    println("Married: ${p.isMarried}")
}

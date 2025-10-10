fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main() {
    val text = "Hello World!"

    val vowels = text.howMany { it.lowercaseChar() in "aeiou" }
    println("Number of vowels: $vowels")

    val digits = text.howMany { it.isDigit() }
    println("Number of digits: $digits")

    val uppercase = text.howMany { it.isUpperCase() }
    println("Number of uppercase letters: $uppercase")

    val letters = text.howMany { it.isLetter() }
    println("Number of letters: $letters")
}
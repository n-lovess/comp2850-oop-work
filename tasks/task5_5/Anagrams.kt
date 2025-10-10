infix fun String.isanagramOf(other: String): Boolean {
    val s1 = this.lowercase().filter { it.isLetterOrDigit() }.toCharArray().sorted()
    val s2 = other.lowercase().filter { it.isLetterOrDigit() }.toCharArray().sorted()
    return s1 == s2
}


fun main() {
    print("Enter the first string: ")
    val first = readln()

    print("Enter the second string: ")
    val second = readln()

    if(second isanagramOf first) {
        println("The strings are anagrams.")
    } else {
        println("The strings are not anagrams.")
    }
}

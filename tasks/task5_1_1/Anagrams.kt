// Task 5.1.1: anagram checking using a function
fun main() {
    print("Enter the first string: ")
    val first = readln()

    print("Enter the second string: ")
    val second = readln()

    val result = anagrams(first, second)

    if(result) {
        println("The strings are anagrams.")
    } else {
        println("The strings are not anagrams.")
    }
}

fun anagrams(str1: String, str2: String): Boolean {
    val s1 = str1.lowercase().filter { it.isLetterOrDigit() }.toCharArray().sorted()
    val s2 = str2.lowercase().filter { it.isLetterOrDigit() }.toCharArray().sorted()
    return s1 == s2
}
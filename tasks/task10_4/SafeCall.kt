fun printReversed(text: String?) {   
    val result = text?.reversed()?.uppercase() ?: "null"
    println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}

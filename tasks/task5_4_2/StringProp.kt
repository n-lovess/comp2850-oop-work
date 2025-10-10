val String.tooLong: Boolean
    get() = this.length > 20
    
fun main() {
    print("Enter a string: ")
    val input = readln()

    if (input.tooLong) {
        println("The string is too long!")
    } else {
        println("The string length is fine.")
    }
}
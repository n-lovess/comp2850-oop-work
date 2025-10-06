fun main() {
    println("Welcome to Kotlin Pizza! Please choose one of the following:")
    println("a) Margherita")
    println("b) Pepperoni")
    println("c) Veggie")
    println("d) Hawaiian")

    while (true) {
        print("Enter your choice (a–d): ")
        val choice = readln().lowercase()

        if (choice.length == 1 && choice[0] in 'a'..'d') {
            println("Order accepted")
            break
        } else {
            println("Invalid choice! Please try again.")
        }
    }
}
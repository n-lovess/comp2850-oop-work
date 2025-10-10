// Task 7.7.2: contact database, using a map
fun main() {
    val contacts = mutableMapOf<String, String>()

    while (true) {
        print("Enter contact name (or blank to quit): ")
        val name = readln().trim()
        if (name.isEmpty()) break

        if (contacts.containsKey(name)) {
            println("Phone number for $name: ${contacts[name]}")
        } else {
            print("Enter phone number for $name: ")
            val number = readln().trim()
            contacts[name] = number
            println("Contact saved.")
        }
    }

    println("\nAll contacts:")
    for ((name, number) in contacts) {
        println("$name: $number")
    }
}
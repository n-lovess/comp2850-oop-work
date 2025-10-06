// Task 4.5: summing odd integers with a for loop
fun main() {
    print("Enter an integer limit: ")
    val limit = readln().toLongOrNull() ?: run {
        println("Invalid input")
        return
    }

    var sum: Long = 0

    for (i in 1..limit step 2) {
        sum += i
    }

    println("The sum of all odd integers between 1 and $limit in $sum")
}
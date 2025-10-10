// Task 7.7.1: stats for a numeric dataset
fun readData() = buildList {
    println("Enter numbers:")
    while (true) {
        val input = readln().trim()
        if (input.isEmpty()) break
        add(input.toDouble())
    }
}

fun median(numbers: List<Double>): Double {
    if (numbers.isEmpty()) return Double.NaN
    val sorted = numbers.sorted()
    val n = sorted.size
    return if (n % 2 == 1) {
        sorted[n / 2]
    } else {
        (sorted[n / 2 - 1] + sorted[n / 2]) / 2
    }
}

fun displayStats(numbers: List<Double>) {
    if (numbers.isEmpty()) {
        println("No data to display statistics.")
        return
    }
    println("Minimum: ${numbers.minOrNull()}")
    println("Maximum: ${numbers.maxOrNull()}")
    println("Mean: ${numbers.average()}")
    println("Median: ${median(numbers)}")
}

fun main() {
    val data = readData()
    displayStats(data)
}
// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics
    val dataset = fetchData()

    val lowest = dataset.minByOrNull { it.second }
    println("Lowest temperature: ${lowest?.first} = ${lowest?.second}")

    val highest = dataset.maxByOrNull{ it.second }
    println("Highest temperature: ${highest?.first} = ${highest?.second}")

    val average = dataset.map { it.second }.average()
    println("Average temperature: %.2f".format(average))

    println("\nDataset sorted by station name:")
    dataset.sortedBy { it.first }.forEach { println("${it.first}: ${it.second}") }
}

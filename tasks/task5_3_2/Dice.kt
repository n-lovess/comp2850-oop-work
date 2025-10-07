// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(sides: Int = 6, dice: Int = 1) {
    if (sides !in setOf(4, 6, 8, 10, 12, 20)) {
        println("Error: cannot have a $sides-sided die")
        return
    }

    println("Rolling $dice d$sides...")

    var total = 0
    for (i in 1..dice) {
        val result = Random.nextInt(1, sides + 1)
        println("Die $i: $result")
        total += result
    }

    println("Total score: $total\n")
}

fun main() {
    println("Dice Roller:\n")

    rollDice(6, 3)

    rollDice(dice = 2, sides = 10)

    rollDice(12)

    rollDice()

    rollDice(dice = 5)
}
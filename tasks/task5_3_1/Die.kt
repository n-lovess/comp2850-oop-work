import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun readInt(prompt: String): Int {
    print(prompt)
    val input = readln()
    return input.toInt()
}

fun main() {
    println("Dice Roller:")

    val sides = readInt("Enter the number of sides on your die:")
    rollDie(sides)

    println("\nRolling some dice randomly")
    rollDie(10)
    rollDie()
}
// Implement the six required functions here
import java.io.File
import kotlin.random.Random

const val WORD_LENGTH = 5
const val MAX_ATTEMPTS = 6
const val NO_MATCH = 0
const val WRONG_POSITION = 1
const val CORRECT = 2

fun isValid(word: String): Boolean = word.trim().let { it.length == WORD_LENGTH && it.all(Char::isLetter) }

fun readWordList(filename: String): MutableList<String> {
    val file = File(filename)
    val words = file
        .readLines()
        .map { it.trim().lowercase() }
        .filter { isValid(it) }
        .toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String {
    require(words.isNotEmpty()) { "Word list empty" }
    val idx = Random.nextInt(words.size)
    return words.removeAt(idx)
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt: ")
        val input = readLine() ?: ""
        if (isValid(input)) {
            return input.trim().lowercase()
        } else {
            println("Invalid guess. Please enter exactly 5 letters.")
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = MutableList(WORD_LENGTH) { 0 }
    val remaining = target.toMutableList()

    for (i in 0 until WORD_LENGTH) {
        if (guess[i] == target[i]) {
            result[i] = CORRECT
            remaining[i] = '_'
        }
    }

    for (i in 0 until WORD_LENGTH) {
        if (result[i] == NO_MATCH && remaining.contains(guess[i])) {
            result[i] = WRONG_POSITION
            remaining[remaining.indexOf(guess[i])] = '_'
        }
    }

    return result
}

fun displayGuess(guess: String, matches: List<Int>) {
    for (i in guess.indices) {
        val c = guess[i]
        val colour = when (matches[i]) {
            CORRECT -> "\u001B[32m"
            WRONG_POSITION -> "\u001B[33m"
            else -> "\u001B[0m"
        }
        print("$colour$c\u001B[0m")
    }
    println()
}

fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)
    println("A random target word has been chosen!")

    for (attempt in 1..MAX_ATTEMPTS) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        if (matches.all { it == 1 }) {
            println("You guessed it! The word was '$target'.")
            return
        }
    }

    println("Out of attempts! The word was '$target'.")
}

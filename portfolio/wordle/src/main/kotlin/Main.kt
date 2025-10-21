fun main() {
    val words = readWordList("data/words.txt")

    val target = pickRandomWord(words)
    val maxAttempts = MAX_ATTEMPTS

    println("Welcome to Wordle (simplified)!")
    println("Guess the 5-letter word. You have $maxAttempts attempts.\n")

    for (attempt in 1..maxAttempts) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        if (matches.all { it == CORRECT }) {
            println("\nCongratulations — you guessed it in $attempt attempts!")
            return
        }
    }

    println("\nOut of guesses. The word was: $target")
}

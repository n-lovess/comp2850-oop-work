fun main() {
    val words = readWordList("data/words.txt")

    val target = pickRandomWord(words)
    val maxAttempts = MAX_ATTEMPTS

    println("Wordle")
    println("Get 6 chances to guess a 5-letter word.\n")

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

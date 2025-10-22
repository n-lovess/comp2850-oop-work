import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

@Suppress("unused")
class WordleTest : StringSpec({
    // Write your tests here

    "isValid works correctly" {
        isValid("apple") shouldBe true
        isValid("app") shouldBe false
        isValid("ab3de") shouldBe false
    }

    "evaluateGuess returns correct matches (enhanced rules)" {
        evaluateGuess("abcde", "abzzz") shouldBe listOf(2, 2, 0, 0, 0)
        evaluateGuess("apple", "apple") shouldBe listOf(2, 2, 2, 2, 2)
        evaluateGuess("apple", "zzzzz") shouldBe listOf(0, 0, 0, 0, 0)
        evaluateGuess("plane", "apple") shouldBe listOf(1, 1, 1, 0, 2)
    }

    "pickRandomWord removes the word and reduces size" {
        val words = mutableListOf("alpha", "bravo", "charl")
        val picked = pickRandomWord(words)
        withClue("Picked word should not remain in list") {
            (picked in words) shouldBe false
        }
        words.size shouldBe 2
    }

    "readWordList filters valid words only" {
        val temp = File.createTempFile("words", ".txt")
        temp.writeText("apple\nnotfive\nabcde\n  grape \n")

        val words = readWordList(temp.path)

        (words.contains("apple")) shouldBe true
        (words.contains("abcde")) shouldBe true
        (words.contains("grape")) shouldBe true
        (words.contains("notfive")) shouldBe false

        temp.deleteOnExit()
    }
})

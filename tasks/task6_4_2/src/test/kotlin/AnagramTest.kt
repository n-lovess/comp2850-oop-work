// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    // Write your unit tests here!
    "Two strings of different lengths are not anagrams" {
        withClue("Different lengths") {
            "abc" anagramOf "abcd" shouldBe false
        }
    }

    "An empty string is not an anagram of itself" {
        withClue("Empty string") {
            "" anagramOf "" shouldBe false
        }
    }

    "A non-empty string is an anagram of itself" {
        withClue("Non-empty string") {
            "hello" anagramOf "hello" shouldBe true
            "WORLD" anagramOf "WORLD" shouldBe true
        }
    }

    "Two strings are anagrams if they contain the same characters in a different order" {
        withClue("Reordered characters") {
            "listen" anagramOf "silent" shouldBe true
            "Triangle" anagramOf "Integral" shouldBe true
            "Dormitory" anagramOf "Dirtyroom" shouldBe true
        }
    }

    "Letter case is disregarded when comparing character sequences" {
        withClue("Case insensitivity") {
            "AbcDe" anagramOf "edCba" shouldBe true
            "Kotlin" anagramOf "LiNtok" shouldBe true
        }
    }
})


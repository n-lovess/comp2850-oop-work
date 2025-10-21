// Task 13.3

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.withClue
import io.kotest.assertions.throwables.shouldThrow

class MoneyTest : StringSpec({

    "Can create a Money" {
        val m = Money(1, 50)
        withClue("euros") { m.euros shouldBe 1 }
        withClue("cents") { m.cents shouldBe 50 }
    }

    "Can create a different Money" {
        val m = Money(2, 99)
        withClue("euros") { m.euros shouldBe 2 }
        withClue("cents") { m.cents shouldBe 99 }
    }

    "Cannot create Money with negative euros" {
        shouldThrow<IllegalArgumentException> {
            Money(-1, 50)
        }
    }

    "Cannot create Money with invalid cents" {
        shouldThrow<IllegalArgumentException> {
            Money(1, 120)
        }
    }

    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50)
    }

    "€1.50 + €2.00 is €3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
    }

    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
    }

    "€2.99 + €0.01 is €3.00" {
        Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
    }

    "toString prints correctly" {
        Money(10, 5).toString() shouldBe "€10.05"
        Money(0, 99).toString() shouldBe "€0.99"
    }
})

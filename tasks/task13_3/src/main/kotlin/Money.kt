// Task 13.3

// Implement your Money class here
data class Money(val euros: Int, val cents: Int) {

    init {
        require(euros >= 0) { "Euros cannot be negative" }
        require(cents in 0..99) { "Cents must be between 0 and 99" }
    }

    operator fun plus(other: Money): Money {
        val totalCents = this.cents + other.cents
        val extraEuros = totalCents / 100
        val remainingCents = totalCents % 100
        val totalEuros = this.euros + other.euros + extraEuros
        return Money(totalEuros, remainingCents)
    }

    override fun toString(): String {
        return "€${euros}.${cents.toString().padStart(2, '0')}"
    }
}


// Task 15.2.3

fun main() {
    // Write your main program here
    val account = SavingsAccount("Nikki", 1.8)

    account.deposit(1250)

    repeat(5) {
        account.applyInterest()
    }

    account.withdraw(50)

    println("Final balance: £${account.balance}")
}

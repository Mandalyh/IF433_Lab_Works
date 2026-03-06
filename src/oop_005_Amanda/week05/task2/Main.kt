package oop_005_Amanda.week05.task2

fun main() {

    val wallet = EWallet("Amanda", 50000.0)
    val card = CreditCard("Amanda", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, card)

    for (method in payments) {
        method.processPayment(75000.0)
    }

}
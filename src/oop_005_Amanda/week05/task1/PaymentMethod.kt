package oop_005_Amanda.week05.task1

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
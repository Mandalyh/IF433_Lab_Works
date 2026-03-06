package oop_005_Amanda.week05.task2

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
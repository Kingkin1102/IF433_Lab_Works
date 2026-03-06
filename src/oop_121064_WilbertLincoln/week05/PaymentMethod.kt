package oop_121064_WilbertLincoln.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
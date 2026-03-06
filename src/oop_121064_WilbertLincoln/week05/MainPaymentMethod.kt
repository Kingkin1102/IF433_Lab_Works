package oop_121064_WilbertLincoln.week05

fun main() {
    val eWallet = EWallet("Gopay Erpe",50000.0)
    val creditCard = CreditCard("CC BCA Erpe", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(eWallet, creditCard)
    val transactionAmount = 75000.0

    for (method in paymentList) {
        println("-> Memproses pembayaran untuk: ${method.accountName}")

        method.processPayment(transactionAmount)

        if (method is EWallet && method.balance < transactionAmount) {
            println("=> Deteksi EWallet dengan saldo kurang. Melakukan auto Top-Up...")
            method.topUp(50000.0)
            method.processPayment(transactionAmount)
        }
        println()
    }
}
package oop_121064_WilbertLincoln.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - EWallet] Transaksi sukses. Saldo tersisa: $balance")
        } else{
            println("[$accountName - EWallet] Transaksi gagal. Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - EWallet] Top up berhasil sebesar $amount. Saldo sekarang: $balance")
    }
}
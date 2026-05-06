package oop_121064_WilbertLincoln.week10

fun main() {
    println("=== INISIALISASI DASHBOARD CRYPTO ===")

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 15.5))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
}
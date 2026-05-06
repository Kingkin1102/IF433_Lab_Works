package oop_121064_WilbertLincoln.week10

fun main() {
    println("=== INISIALISASI DASHBOARD CRYPTO ===")

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 15.5))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    println("Daftar Koin di Dompet:")
    response.data.forEach { coin ->
        println("- ${coin.name} (Saldo: ${coin.balance})")
    }

    val searchResult = coinRepo.searchByName("ETH")
    println("\nHasil Pencarian 'ETH': $searchResult")

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-9901", 0.05))
    txRepo.add(Transaction("TX-9902", 2.5))

    println("\nTotal Transaksi yang dicatat: ${txRepo.getAll().size} transaksi")
}
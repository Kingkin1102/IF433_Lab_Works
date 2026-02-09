package oop_121064_WilbertLincoln.week01

fun main() {
    val gameTitle = "GTA VI"
    val price = 800000

    val finalPrice = calculateDiscount(price)
    printRecipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printRecipt(title: String, finalPrice: Int) {
    println("--- Struk Pembelian ---")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}
package oop_121064_WilbertLincoln.week01

fun main() {
    val gameTitle = "GTA VI"
    val price = 800000

}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()
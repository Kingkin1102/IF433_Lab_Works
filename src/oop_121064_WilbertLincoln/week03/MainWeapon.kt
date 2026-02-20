package oop_121064_WilbertLincoln.week03

fun main() {
    val w = Weapon("Tongat Sakti")

    w.damage = -50
    println("Damage saat ini: ${w.damage}")

    w.damage = 9999
    println("Damage saat ini: ${w.damage}")

    println("Tier Sejata: ${w.tier}")
}
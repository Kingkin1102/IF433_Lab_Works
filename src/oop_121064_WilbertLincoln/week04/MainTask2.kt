package oop_121064_WilbertLincoln.week04

fun main() {
    val manager = Manager("Budi",10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    val developer = Developer("Andi",8000000,"Kotlin" )
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
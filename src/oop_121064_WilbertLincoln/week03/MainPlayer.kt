package oop_121064_WilbertLincoln.week03

fun main() {
    val p = Player("Wilbert")

    //p.xp = 1000 ( error akses langsung)

    p.addXp(50)
    println("Level saat ini: ${p.level}")

    p.addXp(60)
    println("Level saat ini: ${p.level}")
}
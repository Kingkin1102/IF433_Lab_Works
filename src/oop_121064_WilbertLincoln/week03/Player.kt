package oop_121064_WilbertLincoln.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val prevLevel = level
            xp += amount

            if (level > prevLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            } else {
                println("Peringatan: XP yang ditambah harus positif!")
            }
        }
    }
}
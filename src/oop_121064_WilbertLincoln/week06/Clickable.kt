package oop_121064_WilbertLincoln.week06

interface Clickable {
    val name: String

    fun click()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}
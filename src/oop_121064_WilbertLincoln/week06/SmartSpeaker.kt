package oop_121064_WilbertLincoln.week06

import com.sun.jdi.event.StepEvent

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Speaker aktif, menunggu perintah suara.")
    }
    override fun turnOff() {
        println("[$name] Speaker nonaktif.")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}
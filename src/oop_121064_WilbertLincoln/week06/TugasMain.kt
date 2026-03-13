package oop_121064_WilbertLincoln.week06

fun main() {
    println("\n=== TESTING SMART HOME SYSTEM ===")
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    println("---")
    hub.turnOffAllSwitches()
}
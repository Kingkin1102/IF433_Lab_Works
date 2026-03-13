package oop_121064_WilbertLincoln.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] Kamera CCTV aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("[$name] Kamera CCTV nonaktif.")
    }

    override fun startRecord() {
        println("[$name] Memulai perekaman video...")
    }
}
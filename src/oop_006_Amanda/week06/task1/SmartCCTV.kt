package oop_006_Amanda.week06.task1

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] Kamera aktif dan lensa terbuka.")
        startRecord()
    }

    override fun turnOff() {
        println("[$name] Kamera nonaktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Memulai perekaman video...")
    }
}
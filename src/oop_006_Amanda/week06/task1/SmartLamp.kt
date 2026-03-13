package oop_006_Amanda.week06.task1

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Lampu menyala, memberikan cahaya hangat.")
    }

    override fun turnOff() {
        println("[$name] Lampu mati.")
    }
}
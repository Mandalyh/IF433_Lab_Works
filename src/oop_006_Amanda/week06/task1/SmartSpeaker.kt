package oop_006_Amanda.week06.task1

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker aktif, menunggu perintah suara...")
    }

    override fun turnOff() {
        println("[$name] Speaker nonaktif.")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}
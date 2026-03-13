package oop_006_Amanda.week06.task1

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("System: Berhasil menambahkan ${device.name} (ID: ${device.id}) ke hub.")
    }

    fun turnOffAllSwitches() {
        println("\nSystem: Menjalankan protokol penghematan energi...")
        for (device in devices) {
            // Smart Casting (is)
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\nSystem: !!! MENGAKTIFKAN MODE KEAMANAN !!!")
        for (device in devices) {
            // Jika device mendukung perekaman
            if (device is Recordable) {
                device.startRecord()
            }

            // Jika device adalah speaker, bunyikan sirine
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}
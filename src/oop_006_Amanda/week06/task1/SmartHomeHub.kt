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
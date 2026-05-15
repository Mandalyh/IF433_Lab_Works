package oop_011_Amanda.week11.task1

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}
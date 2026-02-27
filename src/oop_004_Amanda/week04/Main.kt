package oop_004_Amanda.week04

fun Main() {
    println("--- Testing vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("=== Testing ElectricCar ===")
    val electricCar = ElectricCar("Tesla", 4, 85)

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}
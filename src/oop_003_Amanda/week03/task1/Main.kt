package oop_003_Amanda.week03.task1

fun main() {

    val sword = Weapon("Dragon Slayer", 300)

    sword.damage = -50
    sword.damage = 9999

    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")
}
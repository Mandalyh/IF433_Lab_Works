package oop_003_Amanda.week03.task1_2

fun main() {
    println("===== TEST WEAPON =====")
    val sword = Weapon("Dragon Slayer", 300)

    sword.damage = -50
    println("Damage setelah -50: ${sword.damage}")

    sword.damage = 9999
    println("Damage setelah 9999: ${sword.damage}")
    println("Tier: ${sword.tier}")

    println("\n===== TEST PLAYER =====")
    val player = Player("Amanda")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}
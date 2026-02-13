package oop_002_Amanda.week02.task2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    println("\nPertarungan dimulai!")
    println("${hero.name} (HP: ${hero.hp}) vs Enemy (HP: $enemyHp)\n")

    while (hero.isAlive() && enemyHp > 0) {

        println("Menu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("Sisa HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas dengan $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("${hero.name} memilih kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }

        println()
    }

    println("\n--- HASIL PERTARUNGAN ---")

    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive()) {
        println("Enemy menang!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
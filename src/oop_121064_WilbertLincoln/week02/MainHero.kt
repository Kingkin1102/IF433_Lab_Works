package oop_121064_WilbertLincoln.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val myHero = Hero(name, damage)
    var enemyHp = 100

    println("\n--- BATTLE START ---")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n[STATUS] ${myHero.name} HP: ${myHero.hp} | Enemy HP: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        println("Pilihanmu: ")

        when (scanner.nextInt()) {
            1 -> {
                myHero.attack("Enemy")
                enemyHp -= myHero.baseDamage
                println("HP Musuh sekarang: $enemyHp")

                if(enemyHp > 0) {
                    val enemyDmg = (10..20).random()
                    myHero.takeDamage(enemyDmg)
                    println("Musuh membalas! $name terkena $enemyDmg damage.")
                }
            }
            2 -> {
                println("Kamu memilih kabur!")
                break
            }
        }
    }

    println("\n--- HASIL AKHIR ---")
    if (enemyHp <= 0 ) {
        println("SELAMAT! ${myHero.name} memenangkan pertaruangan!")
    } else if (!myHero.isAlive()) {
        println("YAH... ${myHero.name} telah gugur dalam tugas.")
    } else {
        println("Pertarungan berakhir imbang karena kabur.")
    }
}
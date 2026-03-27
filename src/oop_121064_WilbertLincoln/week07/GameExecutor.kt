package oop_121064_WilbertLincoln.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Muncul monster ${event.monsterName}!")
        is LootDropped -> {
            val (name, _, rarity) = event.item
            println("Hoki! Dapat item: $name (Rarity: $rarity)")
        }
        is GameOver -> println("Game Over: ${event.reason}")
        SafeZone -> println("Kamu berada di zona aman. Silahkan beristirahat.")
    }
}
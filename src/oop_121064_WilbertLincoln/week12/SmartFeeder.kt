package oop_121064_WilbertLincoln.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {"Porsi kibble harus lebih dari 0 gr"}

    if (isJammed) {
        throw DispenserJamException()
    }
    if(requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram

}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1: PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Hardware Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Stock Error: ${e.message}")
    } catch (e: Exception) {
        println("General Error: ${e.message}")
    }
}
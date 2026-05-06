package oop_121064_WilbertLincoln.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}

    fun <T: NamedEntity> WalletRepository<T>.searchByName(query: String): List<T> {
        return this.getAll().filter { it.name.equals(query, ignoreCase = true)}
    }
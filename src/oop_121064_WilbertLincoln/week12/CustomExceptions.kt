package oop_121064_WilbertLincoln.week12

class InsufficientNumbersException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance")
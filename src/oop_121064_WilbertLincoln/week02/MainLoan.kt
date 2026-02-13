package oop_121064_WilbertLincoln.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("\n--- TUGAS 1: LIBRARY SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        println("LOG: Durasi negatif terdeteksi. Otomatis diatur ke 1 hari.")
        duration = 1
    }

    val myLoan = Loan(bookTitle, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul: ${myLoan.bookTitle}")
    println("Peminjam: ${myLoan.borrower}")
    println("Durasi: ${myLoan.loanDuration}")
    println("Total Denda: Rp ${myLoan.calculateFine()}")
}
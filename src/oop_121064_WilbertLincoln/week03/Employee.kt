package oop_121064_WilbertLincoln.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            //CODE RECURSIVE!!!
            this.salary = value
        }
}
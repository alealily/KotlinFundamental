package Fundamental

fun welcome (awalNama: String, akhirNama: String = "") {
    println("Hallo $awalNama $akhirNama")
}

fun main() {
    welcome("Lily")
    welcome("Alia", "Pramestia")
}
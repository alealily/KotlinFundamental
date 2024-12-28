package Fundamental

fun main() {
    val groups = arrayOf<String>("yellow", "red", "purple", "green")

    println(groups[0])
    println(groups.get(1))
    println("-------------------")

    groups[0] = "Color Matching"
    groups.set(1, "Color Unsuited")

    println(groups[0])
    println(groups.get(1))
    println(groups.get(2))
}
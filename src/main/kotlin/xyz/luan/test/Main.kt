package xyz.luan.test

fun main() {
    val a = arrayOf(null, 1, 2, null)
    println(listOfNotNull(*a))
}

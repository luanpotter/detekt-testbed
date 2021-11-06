package xyz.luan.test

fun main() {
    val el = setOfNotNull(null, null, "a", null).first()
    println("Hello, world: $el")
}

fun <T : Any> setOfNotNull(vararg elements: T?): Set<T> {
    return listOfNotNull(*elements).toSet()
}

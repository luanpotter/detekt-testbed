package xyz.luan.test

fun main() {
    val a = "cabbage".split("").map { CustomWrapper(data = CustomClass(content = it)) }
    val b = a.sortedWith(CustomClass::compareTo.map { it.data }).lastOrNull()
    val c = setOfNotNull(b).single()
    println("Result: ${c.data.content}")
}

class CustomWrapper(val data: CustomClass)
class CustomClass(val content: String)

fun CustomClass.compareTo(other: CustomClass): Int {
    return compareValuesBy(this, other) { it.content }
}

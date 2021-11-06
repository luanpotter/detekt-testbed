package xyz.luan.test

fun <T : Any> setOfNotNull(vararg elements: T?): Set<T> {
    return listOfNotNull(*elements).toSet()
}

fun <T, V> (T.(T) -> Int).map(mapper: (V) -> T): Comparator<V> {
    return Comparator { o1, o2 -> this(mapper(o1), mapper(o2)) }
}

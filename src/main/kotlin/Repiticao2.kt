fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("valor index : " + index)
        println("item at $index is ${items[index]}")
    }
}


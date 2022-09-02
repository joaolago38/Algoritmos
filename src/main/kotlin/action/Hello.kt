package action

fun main() {
    println("===================")
    println("=======Max=========")
    println(max(4,7))
    println("=======Min=========")
    println(min(4,7))

}
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}


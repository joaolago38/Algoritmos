import kotlin.math.max

var a = 1
// simple name in template:
val s1 = "a is $a"

// arbitrary expression in template:
val s2 = "${s1.replace("is", "was")}, but now is $a"

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {
    println("o valor da variavel eh " + s2)
    maxOf(2,4)
    println("o valor de ai no if eh " + a)

 }

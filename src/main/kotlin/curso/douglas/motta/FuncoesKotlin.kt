package curso.douglas.motta

fun main() {
//  println(max(10,5))
    println(max1(5,10))
}
// corpo da funcao
fun max(a : Int , b : Int): Int {
    return if(a > b ) a else b
}

// corpo de expressao

fun max1(a : Int , b : Int) = if(a > b ) a else b

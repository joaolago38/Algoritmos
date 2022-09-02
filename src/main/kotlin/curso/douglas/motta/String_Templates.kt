package curso.douglas.motta

 fun main() {
    val nome  = "Douglas"
     println("Hello $nome!")
     println("A soma eh -> ${soma(3,6)}")
     println("A divisao eh -> ${divisao(6,6)}")
     println("A multiplicacao eh -> ${multiplicacao(3,6)}")
     println("A subtracao eh -> ${subtracao(18,6)}")

}

fun soma(a: Int , b : Int) : Int{

    return a + b
}

fun divisao(a: Int , b : Int) : Int{
    return a / b
}

fun multiplicacao(a: Int , b : Int) : Int{
    return a * b
}

fun subtracao(a: Int , b : Int) : Int{
    return a - b
}
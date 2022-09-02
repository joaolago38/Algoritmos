package conversao.java.kotlin
// Faça um Programa que peça dois números e imprima a soma
fun main(){
    println("Digite dois numeros para somar")
    println("Digite o primeiro numero para somar")
    val soma1 = readLine()!!.toInt()
    var somaTotal:Int = 0
    println("Digite o segundo numero para somar")
    val soma2 = readLine()!!.toInt()
    somaTotal = soma1 + soma2
    println(" A soma dos dois numeros sao ${somaTotal}")
}
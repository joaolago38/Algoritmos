package conversao.java.kotlin

//Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.

fun main(){
    println("Calculo da area do calculo da area de um quadrado")
    println("Digite o valor da base eh:")
    val valorBase = readLine()!!.toDouble()
    println("============================================")
    println("Digite o valor da altura eh:")
    val valorAltura = readLine()!!.toDouble()
    println("============================================")
    var areaQuadrada = valorBase * valorAltura
    println("============================================")
    println("o valor do calculo da area do quadrado :${areaQuadrada}")
}
package conversao.java.kotlin

import java.lang.Math.pow
import java.lang.Math.sqrt

//Faça  um  Programa  que  peça  o  raio  de  um  círculo,  calcule  e  mostre
//sua área
// (A = π r²)
fun main(){
    println("Calculo do raio do circulo")
    println("Digite o valor do raio a ser calculo")
    val raioASerCalculo = readLine()!!.toDouble()
    println("============================================")
    var areaCiclo =(raioASerCalculo * raioASerCalculo) * 3.14
    println("O valor da area calcular eh:${areaCiclo}")

}
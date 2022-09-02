package conversao.java.kotlin

// Faça um programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
//usuário a quantidades de latas de tinta a serem compradas e o preço
//total
fun main(){
    var valorMetrosASerPintadas:Double
    var coberturaDaTintas:Double = 3.0
    var valorLataDeTintas:Double = 80.0
    var totalMetrosQuadradosTintas:Double = 54.0
    var numeroDeLatasTintas:Double

    var precoTotalDasLatasTintas:Double
    println("==================Calculo de Gastos com Tintas =====================================")
    println("Digite qtos metros quadrado:                                                        ")
    valorMetrosASerPintadas = readLine()!!.toDouble()
    println("====================================================================================")
    println("====================================================================================")
    coberturaDaTintas = valorMetrosASerPintadas * totalMetrosQuadradosTintas;
    println("A cobertura total das tintas compradas sao de:${coberturaDaTintas} metros quadrados ")
    println("====================================================================================")
    println("====================================================================================")
    numeroDeLatasTintas = valorMetrosASerPintadas / 18
    println("O numero de latas de tintas para pintar sera de:${numeroDeLatasTintas}              ")
    valorLataDeTintas = numeroDeLatasTintas * 80.0
    println("O valor pago nas  latas de tintas para pintar vai ser no valor:${valorLataDeTintas}")


}
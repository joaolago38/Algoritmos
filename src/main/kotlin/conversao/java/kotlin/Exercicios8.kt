package conversao.java.kotlin
// Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês
fun main(){
    println("Converter metros em centimentros")
    println("Digite o valor ganho por horas : ")
    val valorHora = readLine()!!.toInt()
    println("============================================")
    println("Digite o valor de horas trabalhadas por mes : ")
    val valorHorasTrabalhadasMes = readLine()!!.toInt()
    println("============================================")
    var salarioMes = valorHora * valorHorasTrabalhadasMes
    println("============================================")
    println("o valor do calculo dos seus ganhos por mes eh :${salarioMes}")


}
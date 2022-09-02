package conversao.java.kotlin
//15. Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês, sabendo-se que são descontados 11% para o
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//programa que nos dê:
//.  salário bruto.
//a.  quanto pagou ao INSS.
//b.  quanto pagou ao sindicato.
//c.  o salário líquido.
//d.  calcule  os  descontos  e  o  salário  líquido,  conforme  a  tabela
//abaixo:
//+  Salário  Bruto  :  R$ - IR  (11%)  :  R$ - INSS
//(8%)  :  R$ - Sindicato  (  5%)  :  R$  =  Salário
//Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

fun main(){
    var valorIR:Double
    var valorINSS:Double
    var valorSalarioBruto:Double
    var valorSindicato:Double
    var valorDescontos:Double
    var valorPorHora:Double
    var valorSalarioLiquido:Double
    var numeroHorasTrabalhadas:Double
    println("==================Calculo do Salario do Pessoal ============================")
    println("Digite o numero de horas trabalhadas por mes: ")
    numeroHorasTrabalhadas = readLine()!!.toDouble()
    println("============================================================================")
    println("Digite o valor ganho por horas: ")
    valorPorHora = readLine()!!.toDouble()
    valorSalarioBruto = numeroHorasTrabalhadas * valorPorHora
    println("============================================================================")
    println("O valor do seu salario bruno eh :${valorSalarioBruto}")
    println("============================================================================")
    valorIR = valorSalarioBruto * 1.11 / 100
    println("O valor do seu imposto de renda eh :${valorIR}")
    println("============================================================================")
    valorINSS  =  valorSalarioBruto * 1.08/100
    println("O valor do seu inss eh : ${valorINSS}")
    println("============================================================================")
    valorSindicato = valorSalarioBruto * 1.05 / 100
    println("O valor do seu imposto do sindicato eh :${valorSindicato}")
    println("============================================================================")
    valorSalarioLiquido = valorSalarioBruto - valorSindicato- valorINSS
    println("O valor do seu salario liquido eh :${valorSalarioLiquido}")
    println("============================================================================")


}

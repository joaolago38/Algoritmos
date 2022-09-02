package conversao.java.kotlin.exercios.dois
// As Organizações Tabajara resolveram dar um aumento de salário aos
//seus colaboradores e lhe contraram para desenvolver o programa que
//calculará os reajustes.
//o  Faça um programa que recebe o salário de um colaborador e o
//reajuste segundo o seguinte critério, baseado no salário atual:
//o  salários até R$ 280,00 (incluindo) : aumento de 20%
//o  salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//o  salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//o  salários  de  R$  1500,00  em  diante  :  aumento  de  5% Após  o
//aumento ser realizado, informe na tela:
//o  o salário antes do reajuste;
//o  o percentual de aumento aplicado;
//o  o valor do aumento;
//o  o novo salário, após o aumento
fun main(){
    var salarioFuncionario:Double
    var calculoDoSalarioComAumento:Double
    println("==================Calculo de Salario de Funcionario=====================================")
    println("Qual o valor do seu salario:                                                            ")
    salarioFuncionario = readLine()!!.toDouble()
    println("========================================================================================")
    if(salarioFuncionario <= 280){
        calculoDoSalarioComAumento = salarioFuncionario * 1.20
        println("O seu salario com o aumento eh ${calculoDoSalarioComAumento}")
    }
    if(salarioFuncionario >280 || salarioFuncionario <= 780 ){
        calculoDoSalarioComAumento = salarioFuncionario * 1.15
        println("O seu salario com o aumento eh ${calculoDoSalarioComAumento}")
    }
    if(salarioFuncionario >=780 || salarioFuncionario >= 1500 ){
        calculoDoSalarioComAumento = salarioFuncionario * 1.10
        println("O seu salario com o aumento eh ${calculoDoSalarioComAumento}")
    }
    if(salarioFuncionario > 1500 ){
        calculoDoSalarioComAumento = salarioFuncionario * 1.05
        println("O seu salario com o aumento eh ${calculoDoSalarioComAumento}")
    }
}
package conversao.java.kotlin.exercios.dois

//.  Faça um programa que pergunte o preço de três produtos e informe
//qual  produto  você  deve  comprar,  sabendo  que  a  decisão  é  sempre
//pelo mais barato
fun main(){
    var valorPreco1:Double
    var valorPreco2:Double
    var valorPreco3:Double
    println("==================Verifica qual e o menor preço=====================================")
    println("Digite o valor do primeiro Produto :                                                ")
    valorPreco1 = readLine()!!.toDouble()
    println("====================================================================================")
    println("Digite o valor do segundo Produto :                                      =          ")
    valorPreco2= readLine()!!.toDouble()
    println("====================================================================================")
    println("Digite o valor do terceiro Produto :                                                ")
    valorPreco3 = readLine()!!.toDouble()
    println("=================================================================================== ")
    if((valorPreco1 > valorPreco2 ) && (valorPreco1 > valorPreco3 )) {
        println("Então o valorPreco1 e o preço ")
    }
    if((valorPreco2 > valorPreco1 ) && (valorPreco2 > valorPreco3 )) {
        println("Então o valorPreco2 e o preço ")
    }
    if((valorPreco3 > valorPreco1 ) && (valorPreco3 > valorPreco2 )) {
        println("Então o valorPreco3 e o preço ")
    }
    println("=================================================================================== ")
}
package conversao.java.kotlin.exercios.dois

//Faça um Programa que peça dois números e imprima o maior deles.
fun main(){

    var numeroUm:Int
    var numeroDois:Int
    println("==================Maior numero =====================================")
    println("Digite o primeiro numero :                                          ")
    numeroUm = readLine()!!.toInt()
    println("==================Maior numero =====================================")
    println("Digite o segundo numero :                                          ")
    numeroDois = readLine()!!.toInt()
    if(numeroUm > numeroDois) {
        println(" O maior numero eh :${numeroUm} ")
    }
    if(numeroDois > numeroUm){
        println(" O maior  numero dois : ${numeroDois}" )
    }
}
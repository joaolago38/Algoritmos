package conversao.java.kotlin.exercios.dois

//Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.
fun main(){
    var numeroUm:Int
    println("==================Se o numero e maior que zero=====================================")
    println("Digite o numero :                                          ")
    numeroUm = readLine()!!.toInt()
    if(numeroUm > 0){
       println(" o numero ${numeroUm} e positivo")
    }else {
        println(" o numero ${numeroUm} e negativo")
    }
}
package conversao.java.kotlin
//Faça um Programa que converta metros para centímetros.
fun main(){
    println("Converter metros em centimentros")
    println("Digite o valor que deseja converter para centimentos")
    val valorConverter = readLine()!!.toInt()
    println("============================================")
    var valorSerConvertido = valorConverter * 100;
    println("O valor convertido em cm eh:${valorSerConvertido}")
}
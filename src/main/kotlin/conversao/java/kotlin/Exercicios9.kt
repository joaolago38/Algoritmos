package conversao.java.kotlin

//9.  Faça  um  Programa  que  peça  a  temperatura  em  graus  Farenheit,
//transforme e mostre a temperatura em graus Celsius.
//o  C = (5 * (F-32) / 9).
fun main(){
    var farenheit: Int
    var celsius: Int
    println("==============================================")
    println("Digite em Farenheit : ")
    farenheit = readLine()!!.toInt()
    println("==============================================")
    celsius = (5 * (farenheit - 32) / 9)
    println("==============================================")
    println("o valor em celsius eh: ${celsius} ")

}
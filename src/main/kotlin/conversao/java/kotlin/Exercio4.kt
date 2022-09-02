package conversao.java.kotlin

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
fun main(){
    println("Calculo da media de 4 notas")
    println("Digite 4 notas para o calculo da media delas")
    println("Digite a primeira nota")
    var nota1 =  readLine()!!.toInt()
    println("============================================")
    println("Digite a segunda nota")
    var nota2 =  readLine()!!.toInt()
    println("============================================")
    println("Digite a terceira nota")
    var nota3 =  readLine()!!.toInt()
    println("============================================")
    println("Digite a quarta nota")
    var nota4 =  readLine()!!.toInt()
    println("============================================")
    val mediaDasNotas = nota1+nota2+nota3+nota4/5
    println("Sua media das suas notas sao ${mediaDasNotas}")

}
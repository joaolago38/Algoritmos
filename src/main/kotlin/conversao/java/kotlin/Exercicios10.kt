package conversao.java.kotlin

//11. Faça  um  Programa  que  peça  2  números  inteiros  e  um  número  real.
//Calcule e mostre:
//a.  o produto do dobro do primeiro com metade do segundo .
//b.  a soma do triplo do primeiro com o terceiro.
//c.  o terceiro elevado ao cubo.

fun main(){
    var numero1:Int
    var numero2:Int
    var numero3:Int

    println("==============================================")
    println("Digite o primeiro numero  : ")
    numero1 = readLine()!!.toInt()
    println("==============================================")
    println("Digite o segundo  numero  : ")
    numero2 = readLine()!!.toInt()
    println("==============================================")
    println("Digite o terceiro  numero  : ")
    numero3 = readLine()!!.toInt()
    println("==============================================")
    val resultado = (numero1 * numero1) + (numero3)
    println("o valor em celsius eh: ${resultado} ")
    println("==============================================")
    val resultado2 = (numero1 * numero1*numero1) + ( numero2/2)
    println("o valor em celsius eh: ${resultado2} ")

}

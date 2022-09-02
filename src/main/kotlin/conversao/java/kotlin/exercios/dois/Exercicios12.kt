package conversao.java.kotlin.exercios.dois

//13. Faça um Programa que leia um número e exiba o dia correspondente
//da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
//aparecer valor inválido.
fun main(){
    var numeroDaSemana:Int
    println("==================verifica matutino vespertino ou noturno=====================================")
    println("Digite um dia da semana (1-Domingo, 2- Segunda, 3- Terca, 4- Quarta , 5- Quinta, 6- Sexta , 7- Sabado):                                                ")
    numeroDaSemana = readLine()!!.toInt()
    when(numeroDaSemana){
        1 -> println("O dia da semana e Domingo")
        2 -> println("O dia da semana e Segunda")
        3 -> println("O dia da semana e Terça")
        4 -> println("O dia da semana e Quarta")
        5 -> println("O dia da semana e Quinta")
        6 -> println("O dia da semana e Sexta")
        7 -> println("O dia da semana e Sabado")
    }

}
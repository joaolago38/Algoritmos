package conversao.java.kotlin.exercios.dois

//faça um programa que lê as duas notas parciais obtidas por um aluno
//numa  disciplina  ao  longo  de  um  semestre,  e  calcule  a  sua  média.  A
//atribuição de conceitos obedece à tabela abaixo:
//o  Média de Aproveitamento Conceito
//o  Entre 9.0 e 10.0 A
//o  Entre 7.5 e 9.0 B
//o  Entre 6.0 e 7.5 C
//o  Entre 4.0 e 6.0 D
//o  Entre 4.0 e zero E
//O algoritmo deve mostrar na tela as notas, a média, o conceito
//correspondente e a mensagem “APROVADO” se o conceito for
//A, B ou C ou “REPROVADO” se o conceito for D ou E.

fun main(){
    var valorNota1:Double
    var valorNota2:Double
    var mediaDasNotas:Double = 0.0
    println("==================verifica a media de duas notas e ve aonde ele se engrada=====================================")
    println("Digite o valor da sua primeira nota")
    valorNota1 = readLine()!!.toDouble()
    println("Digite o valor da sua primeira nota")
    valorNota2 = readLine()!!.toDouble()
    println("A primeira nota do aluno eh ${valorNota1}")
    println("A segunda  nota do aluno eh ${valorNota2}")
    mediaDasNotas = valorNota1 + valorNota2 / 2
    println("A media das notas do alunos ${mediaDasNotas}")
    when(mediaDasNotas){
       in  9.0 .. 10.0-> println("O Aluno se enquadra no conceito A")
       in  7.5 .. 9.0 -> println("O Aluno se enquadra no conceito B")
       in  6.0 .. 7.0 -> println("O Aluno se enquadra no conceito C")
       in  4.0 .. 6.0 -> println("O Aluno se enquadra no conceito D")
       in 4.0 .. 0.0 -> println("O Aluno se enquadra no conceito  E")
    }
}


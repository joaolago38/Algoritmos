package curso.douglas.motta

class Pessoa (
              val nome : String ,
              val idade : Int
 )

fun main (){

    val pessoa1 = Pessoa("joao" , 49);
    val pessoa2 = Pessoa("doublas" , 69);
    println("=============Impressao das pessoas ===============")
    println("o nome da pessoa  eh -> ${pessoa1.nome}")
    println("o nome da pessoa  eh -> ${pessoa1.idade}")
    println("========================================")
    println("o nome da pessoa  eh -> ${pessoa2.nome}")
    println("o nome da pessoa  eh -> ${pessoa2.idade}")
}

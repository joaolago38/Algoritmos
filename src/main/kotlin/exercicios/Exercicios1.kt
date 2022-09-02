package exercicios
fun main(){
    //Versão sem função:
    var num2 = 4
    println(num2+num2)

    //versão com função:
    fun dobroDe(dobrar : Int) : Int{

        return dobrar+dobrar
    }

//Exemplo de uso da função dobroDe:
    var y = 5
    println("O dobro de $y é: ${dobroDe(y)}")
}


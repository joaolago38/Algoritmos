package curso.douglas.motta

interface Expressao
class Numero(val valor: Int): Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliaçao(expressao : Expressao): Int{
    if(expressao is Numero){
        val numero = expressao is Numero
        return expressao.valor
    }

    if (expressao is Soma){
        return  avaliaçao(expressao.esquerdo) + avaliaçao(expressao.direito)

    }
    throw  java.lang.IllegalArgumentException("Expressao e desconhecida")

}
fun main(){
    // ((1 + 2) + 4)
    val resultado = avaliaçao(Soma(Soma(Numero(1) , Numero(2)), Numero(4)))
    println(resultado)
}
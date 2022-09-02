package curso.douglas.motta

interface ExpressaoRamificao
class NumeroRamificacao(val valor: Int): ExpressaoRamificao
class SomRamificacao(val esquerdoRamificacao: ExpressaoRamificao, val direitoRamificacao: ExpressaoRamificao): ExpressaoRamificao

fun avaliaçaoRamificacao(expressaoRamificacao : ExpressaoRamificao): Int =
    when (expressaoRamificacao) {
        is NumeroRamificacao -> {
            println("Expressao com numero : ${expressaoRamificacao.valor}")
            expressaoRamificacao.valor

        }
        is SomRamificacao -> {
            println("Soma das avaliacao :")
            avaliaçaoRamificacao(expressaoRamificacao.esquerdoRamificacao) + avaliaçaoRamificacao(expressaoRamificacao.direitoRamificacao)
        }
        else -> throw java.lang.IllegalArgumentException("Expressao e desconhecida")



}
fun main(){
    // ((1 + 2) + 4)
    val resultado1 = avaliaçaoRamificacao(SomRamificacao(SomRamificacao(NumeroRamificacao(1) , NumeroRamificacao(2)), NumeroRamificacao(4)))
    println(resultado1)
}
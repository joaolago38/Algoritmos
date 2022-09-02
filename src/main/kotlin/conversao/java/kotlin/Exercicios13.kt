package conversao.java.kotlin

//13. Tendo  como  dados  de  entrada  a  altura  e  o  sexo  de  uma  pessoa,
//construa  um  algoritmo  que  calcule  seu  peso  ideal,  utilizando  as
//seguintes fórmulas:
//.  Para homens: (72.7*h) - 58
//a.  Para mulheres: (62.1*h) - 44.7 (h = altura)
//b.  Peça o peso da pessoa e informe se ela está dentro, acima ou
//abaixo do peso.

fun main(){
    var alturaPessoaCalculo:Double
    var calculoPesoIdeal:Double
    val variavelCalculoPesoIdealHomem:Double = 72.7
    val variavelCalculoPesoIdealMulher:Double = 62.7
    val segundaVariavelCalculoPesoIdealMulher:Double = 44.7
    val variavelCalculoPesoHomem:Double = 58.0
    val sexoParaCalculoPessoIdeal:String
    println("==================CAlculo do pessol ideal para Homens e Mulheres ============================")
    println("Digite o primeiro seu sexo M (masculino) e F () feminino : ")
    sexoParaCalculoPessoIdeal = readLine()!!.toString()
    println("Digite sua altura ")
    alturaPessoaCalculo = readLine()!!.toDouble()
    if(sexoParaCalculoPessoIdeal.equals("M")){
        println("======================================================================")
        calculoPesoIdeal =((variavelCalculoPesoIdealHomem * alturaPessoaCalculo) - variavelCalculoPesoHomem )
        println("O seu peso ideal eh  : ${calculoPesoIdeal}")

    }else{
        println("======================================================================")
        calculoPesoIdeal =(variavelCalculoPesoIdealMulher * alturaPessoaCalculo - segundaVariavelCalculoPesoIdealMulher )
        println("O seu peso ideal eh  : ${calculoPesoIdeal}")

    }

}
package conversao.java.kotlin

//12. Tendo como dados de entrada a altura de uma pessoa, construa um
//algoritmo  que  calcule  seu  peso  ideal,  usando  a  seguinte  fórmula:
//(72.7*altura) - 58
fun main(){

    var alturaPessoaCalculo:Double
    var calculoPesoIdeal:Double
    val variavelCalculoPesoIdeal:Double = 72.9
    val variavelCalculoPesoIdealDois:Double = 58.0
    println("==================CAlculo do pessol ideal ============================")
    println("Digite o primeiro sua altura  : ")
    alturaPessoaCalculo = readLine()!!.toDouble()
    println("======================================================================")
    calculoPesoIdeal =(variavelCalculoPesoIdeal * alturaPessoaCalculo - variavelCalculoPesoIdealDois )
    println("O seu peso ideal eh  : ${calculoPesoIdeal}")
}
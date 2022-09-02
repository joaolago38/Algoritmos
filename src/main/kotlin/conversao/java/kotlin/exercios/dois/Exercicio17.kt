package conversao.java.kotlin.exercios.dois

//17. Faça  um  Programa  que  peça  um  número  correspondente  a  um
//determinado ano e em seguida informe se este ano é ou não bissexto.

fun main(){
    var valorAno:Int
    var calculoAnoBissexto:Int
     println("==================verifica se o ano e bissexto=====================================")
    println("===================Ano no formato yyyy==============================================")
    println("Digite um ano qualquer :")
    valorAno = readLine()!!.toInt()
    if (valorAno % 400 == 0){
        println(" O ano e bissexto ")
    }else {
        println(" O ano não e bissexto ")
    }

}
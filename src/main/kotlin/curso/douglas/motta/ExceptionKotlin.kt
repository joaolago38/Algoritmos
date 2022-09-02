package curso.douglas.motta


import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(){
// val porcentagem = porcentagem(59)
//    println(porcentagem)

    val idade = lerIdade()
    println(idade)
}
fun porcentagem(numero: Int) : String{
    return if (numero in 1..100){
    "$numero"



    }else{
        throw IllegalArgumentException("$numero de estar entre 1 e 100")
    }
}

fun lerIdade(): Int?{
    val reader = FileReader(File("src/idade.txt"))
    val buffer = BufferedReader(reader)
    try {
        val numero = buffer.readLine()
        return  Integer.parseInt(numero)
    }catch (e: java.lang.NumberFormatException){
       return  null
    } finally {
        buffer.close()
    }

}
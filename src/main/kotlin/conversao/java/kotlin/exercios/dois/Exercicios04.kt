package conversao.java.kotlin.exercios.dois
//4.  Faça  um  Programa  que  verifique  se  uma  letra  digitada  é  vogal  ou
//consoante.

fun main(){
    var verificaLetra:String
    println("==================Verifica se o valor digitado eh vogal ou consoante=====================================")
    println("Digite uma vogal ou consoante :                                                                          ")
    verificaLetra = readLine()!!.toString()
    if(isVogal(verificaLetra)==true){
        println("o valor digitado ${verificaLetra} e uma vogal")
    }
    if(isConsoante(verificaLetra)==true){
        println("o valor digitado ${verificaLetra} e uma consoante")
    }
}

fun isVogal(c :String) = c in "a" .."u" || c in "A" .."U"
fun isConsoante(c :String) = c in "b" .."z" || c in "B" .."Z"

package conversao.java.kotlin.exercios.dois

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
fun main(){
    var valueFeminino:String = "F"
    var valueMasculino:String = "M"
    var valueOutros:String = "O"
    var valorDigitado:String
    println("==================Masculino / Feminino / Outros=====================================")
    println("Digite o F (feminino) , M (Masculino) , Outros (O) :                                          ")
    valorDigitado = readLine()!!.toString()
    if(valorDigitado.equals(valueFeminino)){
        println("foi digitado Feminino")
    }
    if(valorDigitado.equals(valueMasculino)){
        println("foi digitado Masculino")
    }
    if(valorDigitado.equals(valueOutros)){
        println("foi digitado outros")
    }

}
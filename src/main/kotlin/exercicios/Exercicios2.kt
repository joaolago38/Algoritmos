package exercicios
fun main(){
   // 3 - Desenvolva um algoritmo que retorne o antecessor e o sucessor de um número

//Versão sem função:

    var antSuc = 6
    println("Antecessor: ${antSuc -1} \nSucessor: ${antSuc+1}")

//versão com função:

    fun antesDepois(algumNumero : Int){
        println("Antecessor: ${algumNumero -1} \nSucessor: ${algumNumero+1}")
    }

}


package conversao.java.kotlin.exercios.dois
//Faça  um  Programa  que  pergunte  em  que  turno  você estuda.  Peça
//para  digitar  M-matutino  ou  V-Vespertino  ou  N- Noturno.  Imprima  a
//mensagem  "Bom  Dia!",  "Boa  Tarde!"  ou  "Boa  Noite!"  ou  "Valor
//Inválido!", conforme o caso
fun main(){
    var turnoEstudo:String
    var turnoBomDia:String
    println("==================verifica matutino vespertino ou noturno=====================================")
    println("Qual turno voce estuda:                                                ")
    turnoEstudo = readLine()!!.toString()
    if(turnoEstudo.equals("M")){
        println("Matutino")
    }
    if(turnoEstudo.equals("V")){
        println("Vespertino")
    }
    if(turnoEstudo.equals("N")){
        println("Noturno")
    }
}
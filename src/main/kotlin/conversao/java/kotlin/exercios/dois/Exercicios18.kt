package conversao.java.kotlin.exercios.dois
// Faça  um  Programa  que  leia  um  número  inteiro  menor  que  1000  e
//imprima a quantidade de centenas, dezenas e unidades do mesmo.
//o  Observando os termos no plural a colocação do "e", da vírgula
//entre outros. Exemplo:
//o  326 = 3 centenas, 2 dezenas e 6 unidades
//o  12  =  1  dezena  e  2  unidades Testar  com:  326,  300,  100,  320,
//310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
fun main(){
    var valorCentenas:Int
    var valorDezenas:Int
    var valorUnidades:Int
    var qualquaerNmero:Int
    var eliminandoUnidadeDoNumero:Int
    println("==================verifica centenas,dezenas,unidades=====================================")
    println("Digite um numero qualquer :")
    qualquaerNmero = readLine()!!.toInt()
    // Extraindo a unidade
    valorUnidades = qualquaerNmero % 10
    println("O valor das unidades eh:${valorUnidades}")
    eliminandoUnidadeDoNumero = qualquaerNmero -  valorUnidades / 10

    // Extraindo a dezena
    valorDezenas = qualquaerNmero % 10
    eliminandoUnidadeDoNumero = qualquaerNmero -  valorUnidades / 10
}
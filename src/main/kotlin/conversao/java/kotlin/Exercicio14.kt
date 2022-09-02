package conversao.java.kotlin

//14. João  Papo-de-Pescador,  homem  de  bem,  comprou  um
//microcomputador  para  controlar  o  rendimento  diário  de  seu  trabalho.
//Toda  vez  que  ele  traz  um  peso  de  peixes  maior  que  o  estabelecido
//pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
//pagar  uma  multa  de  R$  4,00  por  quilo  excedente.  João  precisa  que
//você  faça  um  programa  que  leia  a  variável  peso  (peso  de  peixes)  e
//verifique se há excesso. Se houver, gravar na variável excesso e na
//variável multa o valor da multa que João deverá pagar. Caso contrário
//mostrar tais variáveis com o conteúdo ZERO.

fun main(){
    var pesoDoPeixeRecibido:Double
    var multa:Double = 4.0
    var valorExcesso:Double = 50.0
    var valorDaMultaASerPago:Double
    println("==================CAlculo do excesso de peso de Peixes ============================")
    println("Digite o peso de peixe pescado ")
    pesoDoPeixeRecibido = readLine()!!.toDouble()
    if(pesoDoPeixeRecibido <= valorExcesso){
        println("o peso pescado esta dentro do limite permitido ")
    }else {
        valorDaMultaASerPago = pesoDoPeixeRecibido * multa
        println("o peso pescado esta fora do permitido a sua multa sera no valor de ${valorDaMultaASerPago}")
    }

}
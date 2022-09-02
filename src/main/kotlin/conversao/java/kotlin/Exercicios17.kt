package conversao.java.kotlin

//17. Faça um Programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
//tinta  é  vendida  em  latas  de  18  litros,  que  custam  R$  80,00  ou  em
//galões de 3,6 litros, que custam R$ 25,00.
//o  Informe ao usuário as quantidades de tinta a serem compradas
//e os respectivos preços em 3 situações:
//o  comprar apenas latas de 18 litros;
//o  comprar apenas galões de 3,6 litros;
//o  misturar  latas  e  galões,  de  forma  que  o  preço  seja  o
//menor. Acrescente  10%  de  folga  e  sempre  arredonde  os
//valores para cima, isto é, considere latas cheias.
fun main(){
    var valorMetrosASerPintadas:Double
    var coberturaDaTintas:Double = 3.0
    var valorLataDeTintas:Double = 80.0
    var valorLataDeTintasMenor:Double = 25.0
    var totalMetrosQuadradosTintas:Double = 54.0
    var numeroDeLatasTintas:Double
    var tipoCompraDaTinta36:String = "Galao"
    var tipoCompraDaTinta80:String = "Lata"
    var tipoCompraDaTinta8036:String = "Lata/Galao"
    var escolhaDoClienteTipoCompra:String
    println("Digite se quer comprar a tinta em Galao ou Lata ou os Dois(Lata/Galao):   ")
    escolhaDoClienteTipoCompra = readLine()!!.toString()
    if (tipoCompraDaTinta80.equals(escolhaDoClienteTipoCompra) ){
        var precoTotalDasLatasTintas:Double
        println("==================Calculo de Gastos com Tintas =====================================")
        println("Digite qtos metros quadrado:                                                        ")
        valorMetrosASerPintadas = readLine()!!.toDouble()
        println("====================================================================================")
        println("====================================================================================")
        coberturaDaTintas = valorMetrosASerPintadas * totalMetrosQuadradosTintas;
        println("A cobertura total das tintas compradas sao de:${coberturaDaTintas} metros quadrados ")
        println("====================================================================================")
        println("====================================================================================")
        numeroDeLatasTintas = valorMetrosASerPintadas / 18
        println("O numero de latas de tintas para pintar sera de:${numeroDeLatasTintas}              ")
        valorLataDeTintas = numeroDeLatasTintas * 80.0
        println("O valor pago nas  latas de tintas para pintar vai ser no valor:${valorLataDeTintas}")
    }
    if (tipoCompraDaTinta36.equals(escolhaDoClienteTipoCompra) ){
        var precoTotalDasLatasTintas:Double
        println("==================Calculo de Gastos com Tintas =====================================")
        println("Digite qtos metros quadrado:                                                        ")
        valorMetrosASerPintadas = readLine()!!.toDouble()
        println("====================================================================================")
        println("====================================================================================")
        coberturaDaTintas = valorMetrosASerPintadas * totalMetrosQuadradosTintas;
        println("A cobertura total das tintas compradas sao de:${coberturaDaTintas} metros quadrados ")
        println("====================================================================================")
        println("====================================================================================")
        numeroDeLatasTintas = valorMetrosASerPintadas / 3.6
        println("O numero de latas de tintas para pintar sera de:${numeroDeLatasTintas}              ")
        valorLataDeTintas = numeroDeLatasTintas * 25.0
        println("O valor pago nas  latas de tintas para pintar vai ser no valor:${valorLataDeTintas}")
    }
    if (tipoCompraDaTinta8036.equals(escolhaDoClienteTipoCompra) ){
        var precoTotalDasLatasTintas:Double
        println("==================Calculo de Gastos com Tintas =====================================")
        println("Digite qtos metros quadrado:                                                        ")
        valorMetrosASerPintadas = readLine()!!.toDouble()
        println("====================================================================================")
        println("====================================================================================")
        coberturaDaTintas = valorMetrosASerPintadas * totalMetrosQuadradosTintas;
        println("A cobertura total das tintas compradas sao de:${coberturaDaTintas} metros quadrados ")
        println("====================================================================================")
        println("====================================================================================")
        numeroDeLatasTintas = valorMetrosASerPintadas / 21.6
        println("O numero de latas de tintas para pintar sera de:${numeroDeLatasTintas}              ")
        valorLataDeTintas = numeroDeLatasTintas * 105.0
        println("O valor pago nas  latas de tintas para pintar vai ser no valor:${valorLataDeTintas}")
    }


}
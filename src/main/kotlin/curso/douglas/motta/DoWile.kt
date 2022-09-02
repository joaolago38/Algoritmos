package curso.douglas.motta

fun main () {
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    do {
        println(" Digite uma temperatura ou 999 para sair :")


        temperatura = readLine()!!.toInt()
        if (temperatura != 999) {
            somatorio += temperatura // somatorio = somatorio + temperatura
            quantidade++ // quantidade = quantidade + 1
        }
        println(" A media das temperaturas eh = ${somatorio/quantidade}")
    } while (temperatura != 999)
}



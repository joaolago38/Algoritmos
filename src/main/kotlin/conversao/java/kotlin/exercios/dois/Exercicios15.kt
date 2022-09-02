package conversao.java.kotlin.exercios.dois

//5. Faça um Programa que peça os 3 lados de um triângulo. O programa
//deverá informar se os valores podem ser um triângulo. Indique, caso
//os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
//escaleno.
//o  Dicas:
//o  Três  lados  formam  um  triângulo  quando  a  soma  de  quaisquer
//dois lados for maior que o terceiro;
//o  Triângulo Equilátero: três lados iguais;
//o  Triângulo Isósceles: quaisquer dois lados iguais;
//o  Triângulo Escaleno: três lados diferentes;
fun main(){
    var valorLados1:Double
    var valorLados2:Double
    var valorLados3:Double
    var somaDosLados:Double
    println("==================verifica o tipo de um triangulo=====================================")
    println("Digite o valor do primeiro  lado do triangulos")
    valorLados1 = readLine()!!.toDouble()
    println("Digite o valor do segunda  lado do triangulos")
    valorLados2 = readLine()!!.toDouble()
    println("Digite o valor do terceiro  lado do triangulos")
    valorLados3 = readLine()!!.toDouble()
    somaDosLados = valorLados1 + valorLados2 + valorLados3
     if((valorLados1 == valorLados2)){
       println("Este e um Triangulo Triângulo Isósceles ")
     }
    if((valorLados1 == valorLados2) || (valorLados1 == valorLados3)){
        println("Este e um Triangulo Equilátero ")
    }
    if((valorLados1 != valorLados2) || (valorLados1 != valorLados3)){
        println("Este e um Triangulo Escaleno ")
    }
    println("a soma dos lados do triangulo sao ${somaDosLados}")
}
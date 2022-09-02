package curso.douglas.motta

class Retangulo (val altura:Int , val largura:Int){

    val isQuadrado:Boolean get() =
         altura == largura

}

fun main(){
    val retangulo : Retangulo = Retangulo(10,11)
    println(retangulo.isQuadrado)
}

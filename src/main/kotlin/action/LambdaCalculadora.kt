package action

fun main(){
  println(sumLambda(2,5))
  println(subtracaoLambda(2,5))
  println(multiplicacaoLambda(2,5))
  println(divisaoLambda(15,5))
}
val sumLambda = { x: Int, y: Int -> x + y }
val subtracaoLambda = { x: Int, y: Int -> x - y }
val multiplicacaoLambda = { x: Int, y: Int -> x * y }
val divisaoLambda = { x: Int, y: Int -> x / y }
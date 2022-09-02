package curso.douglas.motta
// crie um programa que calcule o resultado d
// media da temperatura informadas pelo usuario

fun main(){
 var temperatura :Int = 0;
 var somatorio :Int = 0;
 var quantidade :Int = 0;
    
  while (temperatura != 999)  {
      println("Digite uma temperatura ou 999 para sair : ")
      temperatura = readLine()!!.toInt()


  }
}
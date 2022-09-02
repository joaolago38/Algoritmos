package curso.douglas.motta

import java.util.TreeMap

// imprimir representacao binarias dos caractres de A a F
fun main(){
 val binaryRepresentation = TreeMap<Char,String>()
  for (c in 'A' .. 'F')  {
      val binary = Integer.toBinaryString(c.toInt())
      binaryRepresentation [c]  = binary
  }
    for((letter,binary) in binaryRepresentation ){
        println("$letter - $binary")
    }
}
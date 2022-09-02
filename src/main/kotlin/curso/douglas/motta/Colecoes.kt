package curso.douglas.motta

fun main(){
    val frutas1 = ArrayList<String>()
    frutas1.add("Maca")
    frutas1.add("banana")
    frutas1.add("morango")
    frutas1.add("pera")
    frutas1.add("uva")
    println(frutas1)

    // ArrayList - funcao

    val frutas2 = arrayListOf<String>("maca","laranja","uva","pera")
    println(frutas2)
    println(HashSet::class.java)
    println(frutas2.last())
}
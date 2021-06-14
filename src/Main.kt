fun printStar(n: Int){
    for(i in 1 .. n)  {
        print("*")
    }
    println("")
}

fun function4(name: String ="Default Value"): String {
    return "One for $name, one for me"
}

fun function4optimazed(name: String ="Default Value") = "One for $name, one for me"

fun function5(name:String, number:Int = 42, toUperCase:Boolean = false):String {
    return if(toUperCase) "${name.toUpperCase()}$number" else "$name$number"
}
fun main() {
    //Exo 2
    /*val  n = 5
    printStar(5)

    for(i in 1 .. n)  {
        printStar(5)
    }

    for(i in 1 .. n)  {
        printStar(i)
    }*/

    //Exo 3
    /*val age = 21
    when (age) {
        in 0..17 -> println("Mineur")
        in 18 .. 20 -> println("Majeur en France")
        else -> println("Majeur dans le monde")
    }
    when  {
        age <  18 -> println("Mineur")
        age in 18 .. 20 -> println("Majeur en France")
        age > 20 -> println("Majeur dans le monde")
    }*/
    //Exo 4
   /* println(function4())
    println(function4("toto"))
*/
    //Exo 5
    println(function5("titi",55, true))
}
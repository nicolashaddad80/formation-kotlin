fun printStar(n: Int){
    for(i in 1 .. n)  {
        print("*")
    }
    println("")
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
    val age = 21
    when (age) {
        in 0..17 -> println("Mineur")
        in 18 .. 20 -> println("Majeur en France")
        else -> println("Majeur dans le monde")
    }
}
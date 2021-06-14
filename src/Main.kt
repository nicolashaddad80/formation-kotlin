fun printStar(n: Int){
    for(i in 1 .. n)  {
        print("*")
    }
    println("")
}

fun main() {
    val  n = 5
    printStar(5)

    for(i in 1 .. n)  {
        printStar(5)
    }

    for(i in 1 .. n)  {
        printStar(i)
    }
}
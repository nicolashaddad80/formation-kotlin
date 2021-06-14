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

//Exo6
//Fonction d'extention

fun <T> MutableList<T>.swap(index1:Int,index2:Int){
    require(index1 in 0 until this.size && index2 in 0 until this.size)
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
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
    /*println(function5("titi",55, true))*/

    //Exo 6
    /*val maMutableList = mutableListOf(1, 2, 3, 4, 5)
    println("before Swap: $maMutableList")
    maMutableList.swap(2,3)
    println("after Swap: $maMutableList")
    maMutableList.swap(2,30)
    */

     // Exo 7
    val calculateGrade = {x:Int ->
        when(x){
        in 0 ..40 -> "fail"
        in 41 .. 70 -> "pass"
        in 71 .. 100 -> "distinction"
        else -> "other"
        }
    }

    println(calculateGrade(40))
    println(calculateGrade(70))
    println(calculateGrade(100))
    println(calculateGrade(1000))
}
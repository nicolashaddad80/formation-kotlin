
fun Collection<Int>.containsOdd() = this.any{it%2 ==0}

fun main() {
    val maListImpaire = listOf(1, 3, 5, 7, 9)
    val maList = listOf(1, 3, 5, 6, 9)

    println(maList.containsOdd())
    println(maListImpaire.containsOdd())
}
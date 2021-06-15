fun main() {

    val chaine1 = "GAGCCTACTAACGGGAT"
    val chaine2 = "CATCGTAATGACGGCCT"

    println(chaine1.zip(chaine2).filter{it.first != it.second}.count())
}
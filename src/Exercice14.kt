class ResitanceColorDecoder{
    val colormap = mapOf(
        Pair("Noir",0),
        Pair("Marron",1),
        Pair("Rouge",2),
        Pair("Orange",3),
        Pair("Jaune",4),
        Pair("Vert",5),
        Pair("Bleu",6),
        Pair("Violet",7),
        Pair("Gris",8),
        Pair("Blanc",9)
    )

    fun decodeColor(color: String): Int {

        return colormap.getValue(color)
    }
}

fun main() {
    val decoder = ResitanceColorDecoder()
    println(decoder.decodeColor("Blanc"))
}
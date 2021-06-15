
fun flattenList(source:Collection<*>): Collection<*> {

        return source.filterNotNull().flatMap {
            when(it){
                is Collection<*> -> flattenList(it)
                else -> listOf(it)
            }
        }
}

fun main() {
   val maList1 = mutableListOf<Any?>()
    println(flattenList(maList1))

    val maList2 = listOf(1,listOf(2,3,null,4),listOf(null),listOf(5),null, listOf(6), listOf(listOf(null, 7), 8, listOf(9, 10), null), null)
    println(maList2)
    println(flattenList(maList2))
}


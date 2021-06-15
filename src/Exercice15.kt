data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        Person("Alice"),
        Person("Bob", 29),
        Person("Marc", 42),
        Person("Christine")
    )

    val oldest = persons.maxBy { it.age?:0}?:0
    println("The oldest is: $oldest")
}

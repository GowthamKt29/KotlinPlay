package standardfunction

fun main() {
    data class Person(var name: String, var tutorial: String)

    val person = Person("Anupam", "Kotlin")

    person.apply {
        this.tutorial = "Swift"
        name
    }
    println(person)
}
package standardfunction

fun main() {
    var tutorial = "This is Kotlin Tutorial"
    println(tutorial) //This is Kotlin Tutorial
    tutorial = run {
        val tutorial = "This is run function"
        tutorial
    }
    println(tutorial) //This is run function


    data class Person(var name: String, var tutorial: String)

    val person = Person("Anupam", "Kotlin")

    val isNmae = person.name.run { ::isNameMatches }

    println("$isNmae - Ready to Play?")
}

private fun isNameMatches(canineName: String) = canineName == "Anupam"
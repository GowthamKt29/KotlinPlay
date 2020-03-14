package standardfunction

fun main() {
    val destination = "County".let {
        it.plus(" Dog Park! ")
    }.let(::enhanceString)

    println(destination)

    var a = 1
    var b = 2

//    a = a.let { it + 2 }.let { val i = it + b
//        i}

    var c = a.let { it + 5 }.let { it - b }
    println(c) //5

    // Outside of "main"

}

private fun enhanceString(original: String) =
    original.plus(
        listOf("Amazing!", "I'm Ready!", "Love it!")
            .shuffled()
            .first()
    )
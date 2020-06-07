package higherorder


fun main() {
    val sum: (Int, Int) -> Unit = { a, b ->
        val sum = a + b
        println("$sum")
    }

    addTwoNumber(2, 3, sum)


}

fun addTwoNumber(val1: Int, val2: Int, sum: (Int, Int) -> Unit) {
    sum(val1, val2)
}


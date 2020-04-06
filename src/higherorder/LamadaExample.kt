package higherorder

fun main() {
    val result1 = sum(2, 3)
    val result2 = sum2(20, 30)
    val result3 = sum1(2, 30)
    println("Sum is :$result3")
}

//with type anotation
val sum = { a: Int, b: Int -> a + b }

//with out type annotation
val sum2: (Int, Int) -> Int = { a, b -> a + b }
//val sum2:(Int,Int)->Unit={a,b-> println(a+b)}


val sum1 = { a: Int, b: Int ->
    val res = a + b
    res.toString()
}
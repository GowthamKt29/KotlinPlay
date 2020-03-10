package basics

fun main() {
    var name = "gowtham"

    if (name.equals("Gawtham", true)) {
        println("Same Name")
    } else {
        println("Diiferent Name")
    }

    val num1 = 10
    val num2 = 20
    val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
    println(result)

//    when expression
    val number = 5

    when (number) {
        1 -> println("ONE")
        2 -> println("TWO")
        3 -> println("THREE")
        4 -> println("FOUR")

        else -> println("Invalid number")

    }

    var numberProvided = when (number) {
        1, 5 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")


    when (number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }

//    for loop

    val r = 1.rangeTo(10)
    for (i in r) {
        println("Loops : $i")
    }

//    val arr= arrayOf(1,2,3,4,5,6,7,8)
//    for (i in arr.indices) {
//        println("Loops$i : ${arr[i]}")
//    }

//    while loop
//    var num = 10
//
//    while(num>=5){
//        println("Loop: $num")
//        num--
//    }
//    while (true){
//        println("loop")
//    }

//    var num = 100
//    do {
//        println("Loop: $num")
//        num++
//    }
//    while (num<=105)
}
package basics

fun main() {
//    String length
    var name = "GOWTHAM"
    println("Name length ${name.toLowerCase()}")

//    String template
    val a = 10
    val b = 5

    val myString = """value $a  
        |is greater than value $b  
    """
    println(myString.trimMargin())

// compare string
    val str1 = "Hello, World!"
    val str2 = "Hello, World!"
    println(str1 == str2)
    println(str1 != str2)
    println(str1.equals(str2))


}
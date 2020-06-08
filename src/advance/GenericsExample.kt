package advance

class Person<T>(age: T) {
    var age: T = age

    init {

        this.age = age
        if (age is LocalData) println(age.name) else println("No match")
    }

}

data class LocalData(val name: String)
data class LocalDataDemo(val name: String)

fun main() {
    val local = LocalDataDemo("Gowtham")
    var ageInt = Person(local)
    printData(local)
//    var ageString= Person("30")// compile time error

}

fun <T> printData(data: T) {

}
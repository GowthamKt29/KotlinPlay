package advance

fun main() {
    val data = Data()

    val age: Int by lazy {
        10
    }

    println(age + 10)
    println(age + 20)

    data.name = "gowtham"
    println(data.name)
}

class Data {
    lateinit var name: String
}
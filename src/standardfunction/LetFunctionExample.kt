package standardfunction

data class User(var name: String, var age: String, var type: String) {

    fun printDemo() {

    }
}

fun main() {
    val user = User("gowtham", "26", "Engineer")

    println(user)


//  user?.let {
//        it.name="Gowtham ashok"
//
//    }

    user.apply {
        name = "Gowtham A"
        
    }
    println(user)
}


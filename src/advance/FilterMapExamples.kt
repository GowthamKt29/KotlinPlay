package advance

data class User(val name: String, val age: Int, val id: Int)


fun main() {
    val list = ArrayList<User>()
    list.add(User("Gowtham", 25, 2))
    list.add(User("Ashok", 27, 1))
    list.add(User("Kamal", 29, 3))
    list.add(User("Praveen", 22, 4))
    list.add(User("Vishnu", 20, 5))
    list.add(User("Uday", 28, 6))

    val user: User? = list.find { it.id == 60 }

    println("value is ${user?.name}")
}
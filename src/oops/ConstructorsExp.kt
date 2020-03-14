package oops

fun main() {
//    val add = Add("Gowtham", 25)
//    val add = Add()
//    val add = Add("Gowtham", 25,"Software")
//    println("${add.name}"+"${add.age}")
//    AddNew(5, 6)
//    AddNew(5, 6, 7)
//    AddNew(5, 6, 7, 8)

    val stu = Student("Harry", 24)
}

class Add(val name: String = "Gowtham Ashok", val age: Int = 25) {

    val stuName: String
    var stuAge: Int

    init {
        if (name == "Gowtham") {
            stuName = "NA"
            stuAge = 0
        } else {
            stuName = name.toUpperCase()
            stuAge = age
        }
        println("Student Name is: $stuName")
        println("Student Age is: $stuAge")
    }

    constructor(name: String, age: Int, work: String) : this(name, age) {
        println("Student Name is: $name")
        println("Student Age is: $work")
    }
}

class AddNew {
    constructor(a: Int, b: Int) {

        var c = a + b
        println("Sum of 5, 6 = ${c}")
    }

    constructor(a: Int, b: Int, c: Int) {
        var d = a + b + c
        println("Sum of 5, 6, 7 = ${d}")
    }

    constructor(a: Int, b: Int, c: Int, d: Int) {
        var e = a + b + c + d
        println("Sum of 5, 6, 7, 8 = ${e}")
    }

    init {
        println("Iam inited")
    }
}


open class College {

    constructor(name: String, age: Int) {
        println("parent class constructor")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}

class Student : College {
    constructor(name: String, age: Int) : super(name, age) {
        println("child class constructor")
        println("Student Name: $name")
        println("Student Age: $age")
    }
}
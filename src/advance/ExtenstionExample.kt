package advance

class Circle(val radius: Double) {
    // member function of class
    fun area(): Double {
        return Math.PI * radius * radius;
    }
}

fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)
fun main() {
    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")

    fun Circle.perimeter(): Double {
        return 2 * Math.PI * radius;
    }

    val circle = Circle(2.5)
    println("Area of the circle is ${circle.area()}")
    //invoke extension function
    println("Perimeter of the circle is ${circle.perimeter()}")
}
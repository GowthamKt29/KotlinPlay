package oops

open class Parent() {
    // by default public
    var num = 100

    // visible to this this class only
    private var str = "BeginnersBook"

    // visible to this class and the child class
    protected open val ch = 'A'

    // visible inside the same module
    internal val number = 99

    // visible to this class and child class
    open protected fun demo() {}
}

class Child : Parent() {

    /* num, ch, number and function demo() are
     * visible in this class but str is not visible.
     */
    override val ch = 'Z'

    override fun demo() {
        println("demo function of child class")
    }
}

fun main(args: Array<String>) {

    val obj = Parent()
    /* obj.num and obj.number are visible
    * obj.ch, obj.demo() and obj.str not visible
    */


    val obj2 = Child()

    /* obj2.ch and obj2.demo() are not visible because if
    * you override protected members in child class without
    * specifying modifier then they are by default protected
    */
}
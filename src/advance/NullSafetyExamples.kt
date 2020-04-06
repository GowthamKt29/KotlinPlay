package advance

fun main() {
    val name: String? = null


//    safe call(?.)
    println("Name length  ${name?.length}")

//    safe call let
    name?.let {
        println("Name length  ${name.length}")
    }

//        elvis-call(?:)
//        val lenth= if (name!=null)
//            name.length
//        else
//            -1

    val lenth = name?.length ?: -1
    println("Names  ${lenth}")

//    not null call(!!)
    println("Name length  ${name!!.length}")

}
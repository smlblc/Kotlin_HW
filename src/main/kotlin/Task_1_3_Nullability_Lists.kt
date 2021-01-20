/*
Task 1.3 : Nullability/Lists
Create a list with two elements that are null; do it in two different ways.
Next, create a list where the list is null.
*/

fun main() {

    //First way:
    val a: Int? = null
    val b: Boolean? = null
    var list = listOf(a, b)

    println("List with two null elements : $list")

    //Second Way
    var c: Int?
    var d: String?

    c = null
    d = null

    var secondlist = mutableListOf(c, d)

    println("Different List with two null elements : $secondlist")

    //Next:
    val thirdlist = listOf<String>()
    println("a null list : $thirdlist")

}
import java.lang.reflect.Array

/*
Basic example :
Create an integer array of numbers called numbers, from 11 to 15.
Create an empty mutable list for Strings.
Write a for loop that loops over the array and adds the string representation of each number to the list.
 */

fun main(){
    var numbers : IntArray = intArrayOf(11, 12, 13, 14, 15)
    var list  = mutableListOf<String>()
    for (it in numbers){
        list.add(it.toString())
    }
    println(list)


/*
Challenge example :
How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?
 */

    var divisibleBySeven = mutableListOf<Int>()
    for (i in 0..100){
        if (i % 7 == 0)
            divisibleBySeven.add(i)
    }
    println(divisibleBySeven)

}

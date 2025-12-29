package Collection.List

//🟢 Easy Level
//Given a list of integers, print all even numbers.
//Convert a list listOf(1, 2, 2, 3, 4) into a set and print it.
//Find the size difference between a list and its set.
//Given a list of strings, convert all elements to uppercase.
//Check if a list contains duplicate elements.
//Create a map of student → marks and print all keys.
//Print all values from a map.
//Find the sum of all elements in a list.
//Check if a set contains a specific element.
//Count how many elements are in a list.


fun countElement(){
    val list = listOf(2,3,4,5,6,6,77,8,53,2)
    println(list.count())
}


fun element(){
    val new = setOf("vinayak", "kumar", "test", "here")
    val elementString = new.contains("test")
    println(elementString)
}

fun sumOfList(){
    val list = listOf(2,4,5,6,4,3,2)
    println(list.sum())
}

fun printMap(){
    val map = mutableMapOf<String, Int>("Vinayak" to 20, "Next" to 45, "Stay" to 76, "mine" to 12)
    println(map.keys)
    println(map.values)
}


fun evenNum(){
    val even = listOf(1,2,3,4,5,6,7,8,9)
    println(even.filter { it%2 == 0 })
}

fun listToSet(){
    val even = listOf(1,2,2,3,4,5,6,7,8,9)
    println(even.toSet())
}
fun sizeDiffrence(){
    val even = listOf(1,2,2,3,3,3,4,5,6,7,8,9)
    val evenSet = even.toSet()
    println(even.size - evenSet.size)
}
fun changeUpperCase(){
    val stringnew = listOf("vinayak", "log", "test", "night")
    println(stringnew.map { it.uppercase() })
}
fun findDupicate(){
    val list = listOf(1,2,3,4,4,5,5,5,6,7,8,9)
    val new = list.filter { list.indexOf(it) != list.lastIndexOf(it) }
    println(new.toSet())
}


fun main(){
    evenNum()
    listToSet()
    sizeDiffrence()
    changeUpperCase()
    findDupicate()
    printMap()
    sumOfList()
    element()
    countElement()
}

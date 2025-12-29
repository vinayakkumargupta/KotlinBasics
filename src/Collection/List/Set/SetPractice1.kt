package Collection.List.Set


//Remove duplicates from a list

fun removeDup(){
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    println(numbers.toSet())
}

//Check if an element exists in a set

fun existSet(){
    val fruits = setOf("apple", "banana", "mango")
// Check if "banana" exists
    println("banana" in fruits)

}

//Count unique elements
//val items = listOf("a", "b", "a", "c", "b")
//// Output: 3

fun findUnique(){
    val items = listOf("a", "b", "a", "c", "b")
    println(items.toSet().count())
}

//4️⃣ Convert Set to Sorted List
//val set = setOf(5, 1, 3, 2)
//// Output: [1, 2, 3, 5]

fun sortedList(){
    val setList = setOf(5, 1, 3, 2)
    println(setList.sorted())

}

//5️⃣ Find union of two sets
//val setA = setOf(1, 2, 3)
//val setB = setOf(3, 4, 5)
//// Output: [1, 2, 3, 4, 5]

fun getUnion(){
    val setA = setOf(1, 2, 3)
    val setB = setOf(3, 4, 5)
    println(setA union setB)
}
//6️⃣ Find intersection of two sets
//val setA = setOf(10, 20, 30)
//val setB = setOf(20, 30, 40)
//// Output: [20, 30]

fun getIntersection(){
    val setA = setOf(10, 20, 30)
    val setB = setOf(20, 30, 40)
    println(setA intersect setB)
}

//7️⃣ Find difference between two sets
//val setA = setOf(1, 2, 3, 4)
//val setB = setOf(3, 4)
//// Output: [1, 2]

fun getDifference(){
    val setA = setOf(1, 2, 3, 4)
    val setB = setOf(3, 4)
    println(setA subtract setB)
}
//8️⃣ Find duplicate elements using Set
//val numbers = listOf(1, 2, 3, 2, 4, 1)
//// Output: [1, 2]

fun getDuplicates(){
    val numbers = listOf(1, 2, 3, 2, 4, 1)

    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()

    for (num in numbers) {
        if (!seen.add(num)) {
            duplicates.add(num)
        }
    }

    println(duplicates)   // [1, 2]


}

//9️⃣ Check if all characters are unique
//val word = "kotlin"
//// Output: true

fun getUniquechar(){
    val word = "kotlin"
    val newword  = word.toSet()
    println(newword.size == word.length)
}
//🔟 Count common elements in two lists using Set
//val list1 = listOf(1, 2, 3, 4)
//val list2 = listOf(3, 4, 5, 6)
//// Output: 2
fun getCountList(){
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)
    println((list1.toSet() intersect  list2.toSet()).size)
}

//1️⃣1️⃣ Find elements appearing only once
//val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
//// Output: [1, 3, 5]

fun getOnlyOnce(){
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    println(numbers.filter { numbers.indexOf(it) == numbers.lastIndexOf(it) })
}

//1️⃣2️⃣ Remove duplicates while preserving order
//val numbers = listOf(3, 1, 3, 2, 1)
//// Output: [3, 1, 2]

fun removeDuplicatie(){
    val numbers = listOf(3, 1, 3, 2, 1)
    val seen = mutableSetOf<Int>()
    println(numbers.filter { seen.add(it) })
}
//1️⃣3️⃣ Validate password (all chars must be unique)
//val password = "abcdA1"
//// Output: true
fun uniquePassValid(){
    val password = "abcdA1"
    println(password.toSet().size == password.length)
}
//1️⃣4️⃣ Find missing numbers using Set
//val full = (1..10).toSet()
//val present = setOf(2, 3, 5, 7)
//// Output: [1, 4, 6, 8, 9, 10]

fun getMissingNum(){
    val full = (1..10).toSet()
  val present = setOf(2, 3, 5, 7)
    println(full subtract present)
}

//1️⃣5️⃣ Count unique words in a sentence
//val sentence = "kotlin is fun and kotlin is powerful"
//// Output: 5

fun getUinqueWord(){
    val sentence = "kotlin is fun and kotlin is powerful"
    val unique = sentence.split( " ").toSet()
    println(unique.count())
}


fun main(){
    removeDup()
    existSet()
    findUnique()
    sortedList()
    getUnion()
    getIntersection()
    getDifference()
    getDuplicates()
    getUniquechar()
    getCountList()
    getOnlyOnce()
    removeDuplicatie()
    uniquePassValid()
    getMissingNum()
    getUinqueWord()
}
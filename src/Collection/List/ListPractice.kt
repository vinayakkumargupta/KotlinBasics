package Collection.List
//Create an immutable list of integers: 1, 2, 3, 4, 5.
//
//Print the first element
//
//Print the last element
//
//Print the element at index 2


fun printFirstAndLast(){
        val alist : MutableList<Int> = mutableListOf(1,2,3,4,5)
        //first element
        println(alist[0])
        // last element
        println(alist[alist.count() -1])
        //Print the element at index 2
        println(alist[2])

    }

//Create a mutable list of strings: "Android", "Kotlin", "Jetpack"
//
//Add "Compose"
//
//Remove "Kotlin"
//
//Print the final list

fun addRemove(){
    val nameList : MutableList<String> = mutableListOf("Android", "Kotlin", "Jetpack")
    nameList.add("Compose")
    nameList.remove("Kotlin")
    println(nameList)

}

//Given a list of numbers listOf(10, 20, 30, 40)
//
//Print each number using:
//
//a for loop
//
//forEach

fun printNum(){
    val numList : MutableList<Int> = mutableListOf(10,20,30,40)
    for (nums in numList){
        println(nums)
    }
    numList.forEach {
        println(it)
    }
}

//4️⃣ Filter Even Numbers
//
//Given a list of integers 1..10,
//create a new list that contains only even numbers

fun onlyEven(){
   val list = (1..10).toList()
       .filter { it % 2 == 0 }
    print(list)
}

//5️⃣ Map Transformation
//
//Given a list of integers listOf(1, 2, 3, 4)
//create a new list where each number is squared.

fun squaredList(){
    val list : MutableList<Int> = mutableListOf(1,2,3,4)
    print(list.map { it * it })
    val listnew = listOf(1,2,3,4).map { it * it}
    print(listnew)
}

//6️⃣ Find & Contains
//
//Given a list of names listOf("Vinayak", "Rahul", "Amit")
//
//Check if "Rahul" exists
//
//Find the first name whose length is greater than 5

fun findContain(){
    val nameList = mutableListOf("Vinayak", "Rahul", "Amit")
    if("Rahul" in nameList) println("exists") else print("not exists")
    val length5 = nameList.firstOrNull { it.length >5 }
    println(length5)
}
//7️⃣ Sorting
//
//Given a list listOf(5, 2, 9, 1, 7)
//
//Sort it in ascending order
//
//Sort it in descending order

fun ascDes(){
    val list = listOf(5, 2, 9, 1, 7)
    println(list.sorted())
    println(list.sortedDescending())
}

//8️⃣ Null Safety with List
//
//Given a list:
//
//listOf("A", null, "B", null, "C")
//
//
//Remove all null values
//
//Print the clean list

fun removeNull(){
    val list: MutableList<String?> = mutableListOf("A", null, "B", null, "C")

    list.removeAll { it == null }

    println(list)

}
//9️⃣ Sum & Average
//
//Given a list of prices: listOf(100, 200, 300, 400)
//
//Find the sum
//
//Find the average

fun sumAverage(){
    val list =  listOf(100, 200, 300, 400)
    var newSum = 0
    var newAverage: Double = 0.0
    var sum = list.sum()
    var average = list.average()
    println(sum)
    println(average)
    // fr loop

    for (item in list){
        newSum += item
    }
    newAverage = newSum.toDouble()/list.size

    println(newSum)
    println(newAverage)
}

//🔟 Real-world Style Question
//
//You have a list of cart item prices:
//listOf(499, 1299, 299, 999, 199)
//
//Filter items greater than 500
//
//Apply 10% discount to those items
//
//Return the final discounted list

fun discountItem(){
    val list = listOf(499, 1299, 299, 999, 199)
      list.filter { it > 500 }
          .forEach {
              println(it - (it*10)/100)
          }
}



    fun main() {
     printFirstAndLast()
        addRemove()
        printNum()
        onlyEven()
        squaredList()
        findContain()
        ascDes()
        removeNull()
        sumAverage()
        discountItem()
    }

package Collection.List

import java.time.chrono.JapaneseEra.values


//
//Q1. Given a list of integers, find all even numbers.
//val numbers = listOf(1, 2, 3, 4, 5, 6)

fun getEvenNum(){
    val list = listOf(1,2,3,4,5,6)
    for (item in list){
        if(item%2==0) println(item)
    }
}

//Q2. From a list of prices, apply a 10% discount and return the new list.
//val prices = listOf(100, 200, 300)

fun applyDiscount(){
    val price = listOf(100,200,300)

    val newPrice = price.map { it - ((it*10)/100)}
    println(newPrice)
}

//Q3. Count how many numbers are greater than 50.
//val values = listOf(10, 60, 45, 80, 30)

fun findGreater(){

    val list = listOf(10,60,45,80,30)
    val newList =  list.filter{ it >50 }
    println(newList)

}

//Q4. Convert a list of names to uppercase.
//val names = listOf("vinayak", "rahul", "amit")

fun changeToUpperCase(){
    val name = listOf("vinayak", "rahul", "amit")
    val newName  = name.map { it.uppercase() }
    println(newName)
}

//Q5. Remove duplicate values from a list using filter (not distinct).
//val numbers = listOf(1, 2, 2, 3, 4, 4, 5)

fun removeDuplicates(){
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    val uniqueNumbers = numbers.filter { numbers.indexOf(it) == numbers.lastIndexOf(it) }
    println(uniqueNumbers)

}
//Q6. Find the sum of all odd numbers in a list.
//val numbers = listOf(1, 2, 3, 4, 5, 6, 7)

fun OddSum(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    var sumNum = numbers.filter { it %2 != 0 }.sum()
    println(sumNum)
}

//Q7. Find the maximum and minimum number using Kotlin functions.
//val prices = listOf(120, 340, 560, 90, 220)
fun findMinMax(){
    val prices = listOf(120, 340, 560, 90, 220)
    val max = prices.max()
    val min = prices.min()
    println("Max : $max")
    println("Min : $min")
}
//Q8. From a list of strings, return only those with length greater than 4.
//val words = listOf("cat", "tiger", "lion", "dog", "elephant")

fun length4(){
    val words = listOf("cat", "tiger", "lion", "dog", "elephant")
    println(words.filter { it.length == 4 })

}
//Q9. Check if any number in the list is divisible by 7.
//val numbers = listOf(10, 14, 23, 41)

fun divisbley7(){
    val numbers = listOf(10, 14, 23, 41)
    println(numbers.filter { it %7 == 0 })
}
//Q10. Multiply each number by 2 and return only results greater than 10.
//val numbers = listOf(2, 4, 6, 8)

fun divisbleby2(){
    val numbers = listOf(2, 4, 6, 8)
    val multipliedNum = numbers.map { it * 2 }
    println(multipliedNum.filter { it >10 })
}


fun main(){
    getEvenNum()
    applyDiscount()
    findGreater()
    changeToUpperCase()
    removeDuplicates()
    OddSum()
    findMinMax()
    length4()
    divisbley7()
    divisbleby2()

}
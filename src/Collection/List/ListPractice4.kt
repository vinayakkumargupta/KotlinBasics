package Collection.List


//🔹 MIN / MAX
//Q1. Find the largest number in the list without using maxOrNull()


fun largestNum(){
    val numbers = listOf(4, 9, 1, 7, 2)
    var min = numbers[0]
    var max = numbers[0]
    for (item in numbers){
        if(item>max) max = item
        if(item<min) min = item
    }
    println("min: $min")
    println("max: $max")

}

//Q2. Find the smallest number in the list using minOrNull()
//val numbers = listOf(40, 10, 25, 5, 60)

fun findSmall(){
    val numbers = listOf(40, 10, 25, 5, 60)
    println(numbers.minOrNull())
}
//Q3. Find the maximum EVEN number
fun maxEven(){
    val numbers = listOf(3, 8, 5, 12, 7, 10)
    val evenu = numbers.filter { it % 2 == 0 }
    println(evenu.maxOrNull())
}
//Q4. Find the minimum ODD number

fun minOdd(){
    val numbers = listOf(11, 4, 9, 2, 7)
    val oddNum = numbers.filter { it % 2 != 0 }.minOrNull()
    println(oddNum)
}
//🔹 ODD / EVEN
//Q5. Count how many even numbers are in the list

fun countEven(){
    val numbers = listOf(2, 5, 8, 9, 12, 15)
     val evenNum = numbers.filter { it % 2 == 0 }.count()
    println(evenNum)
}
//Q6. Create a list containing only odd numbers
fun onlyOdd(){
    val numbers = listOf(1, 4, 7, 10, 13)
    val oddNumbers = numbers.filter { it % 2 != 0 }
    println(oddNumbers)

}

//Q7. Find the sum of all even numbers

fun sumOfEvenNum(){
    val numbers = listOf(2, 3, 4, 5, 6)
    val num = numbers.filter { it % 2 == 0 }.sum()
    println(num)
}

//Q8. Find all words with length greater than 5
fun length5(){
    val words = listOf("apple", "banana", "cat", "elephant", "dog")
    println(words.filter { it.length > 5 })
}
//Q9. Find the longest word in the list
fun longestWord(){
    val words = listOf("pen", "notebook", "eraser", "scale")
    var mxword = words[0]
    for (word in words){
        if(word.length> mxword.length) mxword = word
    }
    println(mxword)

}
//Q10. Count how many words have even length
fun funEvenLong(){
    val words = listOf("hi", "hello", "code", "kotlin")
    val evenLengthCount = words.count { it.length % 2 == 0 }
    println(evenLengthCount)

}

//Q11. Remove duplicates using distinct()

fun removeDup(){
    val numbers = listOf(1, 2, 2, 3, 3, 4)
    println(numbers.distinct())
}

//Q12. Find only unique values (appear once) using filter
fun findUnique(){
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    println(numbers.filter { numbers.indexOf(it) == numbers.lastIndexOf(it) })
}

//Q13. Find numbers that appear more than once
fun findMorethanOnce(){
    val numbers = listOf(6, 7, 7, 8, 9, 9, 9)
    val dup = numbers.filter { numbers.indexOf(it) != numbers.lastIndexOf(it)  }.distinct()
    println(dup)
}

//Q14. Check if the list contains any duplicate

fun findDup(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val hasDuplicate = numbers.filter{numbers.size != numbers.distinct().size}
    println(hasDuplicate)


}

//Q15. Count how many unique elements are present
fun findUniqueSize(){
    val numbers = listOf(10, 20, 20, 30, 40, 40, 50)
    val uniqueCount = numbers.distinct().size
    println(uniqueCount)


}




fun main(){
   largestNum()
    findSmall()
    maxEven()
    minOdd()
    countEven()
    onlyOdd()
    sumOfEvenNum()
    length5()
    longestWord()
    funEvenLong()
    removeDup()
    findUnique()
    findMorethanOnce()
    findDup()
    findUniqueSize()
}
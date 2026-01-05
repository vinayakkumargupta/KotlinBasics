package ArrayPractice


fun question1(){
    val newArray = arrayOf(3,4,5,6,7,8,9)
    for (i in newArray){
        println(i)
    }
}
fun question2(){
    val newArray = arrayOf(3,6,4,1,8,9)
    var sum = 0
    for (i in newArray){
        sum =  sum+i
    }
    println(sum)
}
fun question3(){
    val newArray = arrayOf(44,3,21,67,98,22)
    var max = newArray[0]
    for (i in newArray){
        if(i>max) max = i
    }
    println(max)
}
fun question4(){
    val newArray = arrayOf(44,3,21,67,98,22)
    var min = newArray[0]
    for (i in newArray){
        if(i<min) min = i
    }
    println("Min : $min")
}

fun question5(){
    val newArray = arrayOf(44,3,21,67,98,22,55)
    var evenCount = 0
    var oddCount = 0
    for (i in newArray){
        if(i % 2 == 0 ) evenCount++ else oddCount++
    }
    println("Total even : $evenCount")
    println("Total odd : $oddCount")
}
fun question6(){
    val newArray = arrayOf(44,3,21,67,98,22,55)
    for (i in newArray.size -1 downTo 0){
        print("${newArray[i]} ")
    }
    println()
}

fun question7(){
    val find = 67
    var found = false
    val newArray = arrayOf(44,3,21,67,98,22,55)
    for(i in newArray){
       if(i == find) found = true
    }
    println(found)
}
fun question8(){
    val occurence = 67
    var count = 0
    val newArray = arrayOf(44,3,21,67,98,22,55,67,67)
    for (i in newArray){
        if(i == occurence) count++
    }
    println(count)
}

fun question9(){
    val newArray = arrayOf(44,3,21,67,98,22,55,67,67)
    val copyArray = IntArray(newArray.size)
    for (i in newArray.indices){
        copyArray[i] = newArray[i]
    }
    println(copyArray.joinToString())
}

fun question10() {
    val newArray = arrayOf(44, 3, 21, 67, 98, 22, 55, 67, 67)

    var isSorted = true

    for (i in 0 until newArray.size - 1) {
        if (newArray[i] > newArray[i + 1]) {
            isSorted = false
            break
        }
    }

    if (isSorted) {
        println("Sorted")
    } else {
        println("Not Sorted")
    }
}

fun main(){
   question1()
    question2()
    question3()
    question4()
    question5()
    question6()
    question7()
    question8()
    question9()
    question10()
}

import kotlin.math.max
import kotlin.math.sign


fun arrayStar1(){
    var sum = 0
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    for(i in num){
       sum = sum+i
    }
    println(sum)
}
fun arrayStar2(){
    var sum = 0
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    for(i in num){
        print("${i} ")
    }
}

fun arrayStar3(){
    var sum = 0
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    for(i in num){
        if(i%2== 0){
            print("$i ")
        }
    }
}
fun arrayStar4(){
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    var maxNum = num[0]
    for(i in num){
       if(maxNum<i){
           maxNum = i
       }
    }
    println(maxNum)
}
fun arrayStar5(){
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    var maxNum = num[0]
    for(i in num){
        if(maxNum>i){
            maxNum = i
        }
    }
    println(maxNum)
}
fun arrayStar6(){
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    var start = 0
    var end = num.size-1
    for (i in 0 until num.size/2){
        val temp =  num[start]
        num[start] = num[end]
        num[end] = temp
        start++
        end--
    }
    println(num.joinToString( " "))
}

fun arrayStar7(){
    //find occurence
    var num = readLine()!!.split( " ").map(String::toInt).toIntArray()
    var occurence = readLine()!!.toInt()
    var count = 0
    for (i in num){
        if(occurence == i){
            count++
        }
    }
    println(count)
}

fun arrayStar8(){
    // find sorted or not
    var isSorted = true
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    for (i in 0 until num.size-1){
        if(num[i]> num[i+1]){
           isSorted = false
            break
        }
    }
    println(isSorted)
}

fun arrayStar9(){
    var num = readLine()!!.split(" ").map(String::toInt).toIntArray()
}

fun main(){
   arrayStar8()
}
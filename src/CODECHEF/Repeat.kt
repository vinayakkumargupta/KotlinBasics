package CODECHEF

import kotlin.math.max


//Read an integer t. Using repeat, print "Hello Kotlin" exactly t times.
//Read t. For each test case, read one integer n and print n * n.
//Read t. For each test case, read two integers a b and print their sum.
//Read t. For each test case, read a string and print its length.
//Read t. For each test case, read an integer n and print numbers from 1 to n.
//Read t. For each test case, read an integer and print "EVEN" or "ODD".
//Read t. For each test case, read three integers and print the maximum.
//Read t. For each test case, read an integer n and print factorial of n.


fun question1(){
    var input = readLine()!!.toInt()
    var t: Int = input
    repeat(t){
      println("Hello Kotlin")
    }
}
fun question2(){
    var t = readLine()!!.toInt()
    repeat(t){
        var x = readLine()!!.toInt()
        println("${x * x}")
    }
}
fun question3(){
    var t = readLine()!!.toInt()
    repeat(t){
        var(a,b) = readLine()!!.split(" ").map(String::toInt)
        println(a+b)
    }
}

fun question4(){
    var t = readLine()!!.toInt()
    repeat(t){
        var x = readLine()!!
        println(x.length)
    }
}
fun question5(){
    var t = readLine()!!.toInt()
    repeat(t){
        var x = readLine()!!.toInt()
        for(i in 1 until x){
            println(i)
        }
    }
}
fun question6(){
    var t = readLine()!!.toInt()
    repeat(t){
        var x = readLine()!!.toInt()
        if(x%2 == 0){
            println("EVEN")
        }else{
            println("ODD")
        }
    }
}
fun question7(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (x,y,z) = readLine()!!.split(" ").map(String::toInt)
        println(maxOf(x,y,z))
    }
}
fun question8(){
    var t = readLine()!!.toInt()

    repeat(t){
        var sum = 1
        var x = readLine()!!.toInt()
        for(i in 1..x){
            sum = i * sum
        }
        println(sum)
    }
}

fun main(){
//    question1()
//    question2()
//    question3()
//    question4()
    question8()
}
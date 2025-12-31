package Collection.List

//🟢 Basic (1–10)
//Write a Kotlin program to check whether a number is positive, negative, or zero using if-else.
//Given two numbers, print the greater number using if as an expression.
//Write a program to check whether a given year is a leap year.
//Use a when statement to print the day name for a number (1 → Monday, 7 → Sunday).
//Print numbers from 1 to 10 using a for loop.
//Print all even numbers between 1 and 20.
//Use a while loop to print numbers from 10 down to 1.
//Write a program to check whether a number is even or odd using if.
//Use a when expression to check a grade (A, B, C, D, F) and print remarks.
//Print the sum of first N natural numbers using a loop.
//🟡 Medium (11–22)
//Given a number, print whether it is divisible by both 3 and 5.
//Use a loop to calculate the factorial of a number.
//Write a program to reverse a number using a while loop.
//Given a list of integers, print only the positive numbers using a loop.
//Use when with ranges to classify a person’s age group:
//0–12 → Child
//13–19 → Teen
//20–59 → Adult
//60+ → Senior
//Print the multiplication table of a given number (up to 10).
//Write a program to check whether a number is prime.
//Use a loop to count how many digits are in a number.
//Print all numbers from 1 to 50, but:
//Skip multiples of 5
//Stop completely if number reaches 40
//Given a list of numbers, find the largest element without using max().
//Use nested loops to print this pattern:
//*
//**
//***
//****
//Write a program that prints numbers from 1–100:
//Print "Fizz" for multiples of 3
//"Buzz" for multiples of 5
//"FizzBuzz" for both
//🔴 Tricky / Interview-Level (23–35)
//What will be the output?
//val x = 10
//val result = if (x > 5) x * 2 else x / 2
//println(result)
//Predict the output:
//for (i in 1..5) {
//    if (i == 3) continue
//    println(i)
//}
//What happens here and why?
//val value = when (5) {
//    in 1..3 -> "Low"
//    in 4..6 -> "Medium"
//    else -> "High"
//}
//println(value)
//Write a program that finds the first even number in a list and stops the loop immediately.
//Use when without an argument to check:
//number > 0
//number < 0
//number == 0
//What is the output?
//var sum = 0
//for (i in 1..5) {
//    sum += i
//}
//println(sum)
//Write a program that prints only unique characters from a string using loops and conditions.
//Explain the difference between:
//for (i in 1 until 5)
//for (i in 1..5)
//(by writing code that prints both)
//What is the output?
//var i = 0
//while (i < 3) {
//    println(i)
//    i++
//}
//Write a program that checks whether a string is a palindrome using control flow only.
//Predict the output:
//for (i in 5 downTo 1 step 2) {
//    println(i)
//}
//Write a program that counts how many numbers in a list are greater than 10.
//Use nested if or when to implement a simple calculator (+, -, *, /).


fun question17(){
    //prime number
    val num = 6
    var isPrime = true

    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    println(isPrime)

}

fun question16(){
    val table = 5
    for(i in 1..10){
        println("$table x $i = ${table*i}")
    }
}


fun question15(){
    val age = 17
    when(age){
        in 0..12 -> println("Child")
        in 13..19 -> println("Teen")
        in  20..59 -> println("Adult")
    }
}


fun question14(){
    //postive from a list
    val list = listOf(-2, 3, -1, 5)
    println(list.filter { it>0 })
}


fun question13(){
    //reverse a number
    var num = 12023
    var rem = 0
    while (num>0){
        rem = rem*10 + num%10
        num = num/10

    }
    println(rem)
}


fun question12(){
    //find factorial
    val num = 4
    //0,1,1,2,3,5
    var fact = 1
    for(i in 1..num){
      fact *= i
    }
    println(fact)
}


fun question11(){
    val num = 11
    if(num % 3 == 0 && num % 5 == 0){
        println("Divisble by 3 and 5 ")
    }else{
        println("Dont divible by 3 and 5")
    }

}




fun question10(){
    val n = 5
    var sum = 0
    var i = 1  // 1. Initialization: Start at 1

    while (i <= n) {  // 2. Condition: Run as long as i is 5 or less
        sum += i      // 3. Action: Add i to sum
        i++           // 4. Increment: Move to the next number
    }

    println(sum) // Output: 15
}

fun question9(){
    val grade = "A"
    when(grade){
        "A" -> println("Excellent")
        "B" -> println("Very Good")
        "C" -> println("Good")
        "D" -> println("Bad")
        "E" -> println("Very Bad")
    }
}

fun evenOrOdd(){
    val num =  8
    if (num % 2 == 0) println("Even") else println("Odd")

}

fun question7(){
    val num = 7
    if (num % 2 == 0) println("Even") else println("Odd")

}


fun question6(){
    var i = 10
    while (i >= 1) {
        println(i)
        i--
    }

}

fun printEven(){
    for (i in 1..20){
        println(i%2 == 0)
    }
}

fun question5(){
    for (i in 1..10){
        println(i)
    }
}

fun question4(){
    val day = 3
    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wed"
        4 -> "Thur"
        5  -> "Fri"
        6 -> "Sat"
        7 -> "Sun"
        else -> "Not found"
    }
    println(result)
}


fun question3(){
    val year = 2000
    if((year % 4  == 0 && year % 100 != 0) || year%100 == 0){
        println("Leap Year")
    } else {
        println("Not a Leap year")
    }
}


fun question1(){
    val num = 7
    if(num >0){ // postive
       println("Positive")
    }else if(num == 0){ // zero
       println("Zero")
    }else{
        println("Negative")
    }
}

fun question2(){
    val n = 10
    val s = 20
    if(n>s){
        println(n)
    }else{
        println(s)
    }
}



fun main(){
  question1()
    question2()
    question3()
    question4()
    question5()
    printEven()
    question6()
    question7()
    evenOrOdd()
    question9()
    question10()
    question11()
    question12()
    question13()
    question14()
    question15()
    question16()
    question17()

}
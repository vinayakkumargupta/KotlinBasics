package CODECHEF


//Read a string and reverse it using StringBuilder.
//Read a string and remove all vowels using StringBuilder.
//Read a string and print only digits from it.
//Read a string and count how many uppercase letters it has.
//Read a string and build a new string where:
//even index → uppercase
//odd index → lowercase
//Read two strings and concatenate them using StringBuilder.
//Read a string and check if it is a palindrome using StringBuilder.


fun questionS7(){
    var t = readLine()!!
   var s = StringBuilder(t).reverse().toString()
    if(s == t){
        print("Is Palindrome")
    }else{
        print("Not Palindrome")
    }
}


fun questionS6(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (a,b) = readLine()!!.split(" ")
        println(a+b)
    }
}


fun questionS5(){
    var t = readLine()!!
    var result = StringBuilder()
    for(i in t.indices){
        if(i%2 == 0){
          result.append(t[i].uppercaseChar())
        }else{
            result.append(t[i].lowercaseChar())
        }
    }
    println(result)

}


fun questionS4(){
    var s = readLine()!!
    var x = StringBuilder()
//    var result = s.filter { it.isUpperCase() }
//    print(result)
    for (i in s){
        if(i.isUpperCase()){
            x.append(i)
        }
    }
    print(x)
}

fun questionS3(){
    var s = readLine()!!
    var x = StringBuilder()
//    var result = s.filter { it.isDigit() }
//    print(result)
    for (ch in s) {
        if (ch in '0'..'9') {
            x.append(ch)
        }
    }
   print(x)

}

fun questionS1(){
    var s = readLine()!!
    var x = StringBuilder(s)
    for (i in x.length-1 downTo  0){
        print(x[i])
    }
}
fun questionS2(){
    var s = readLine()!!
    var vowels = listOf('a','i','o','e','u')
    var x = StringBuilder()
    for (i in s){
       if(i !in vowels ){
           x.append(i)
       }
    }
    print(x.toString())
}


fun main(){
    questionS7()

}
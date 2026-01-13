package CODECHEF

fun reverseString(){
    var S = "Hello"
    var reverse = ""
    for(i in S){
        reverse = i +reverse
    }
    println(reverse)
}

fun main(){
    reverseString()
}
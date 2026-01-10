package CODECHEF



//Read t. For each test case, read two integers in one line and print their product.
//Read t. For each test case, read 3 integers using destructuring and print their average.
//Read t. For each test case, read a b and swap them without using a temp variable.
//Read t. For each test case, read a b c and print the smallest number.
//Read t. For each test case, read x y and print x^y.
//Read t. For each test case, read a b and print all numbers between them.
//Read t. For each test case, read a b c d and print their sum.


fun questionD1() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (a, b) = readLine()!!.split(" ").map(String::toInt)
        println(a * b)
    }
}
fun questionD2(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
        println((a+b+c)/3)
    }
}
fun questionD3(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (a,b ) = readLine()!!.split(" ").map(String::toInt)
        a = b.also { b = a }
        println("$a $b")
    }
}
fun questionD4(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (a,b,c) = readLine()!!.split(" ").map(String::toInt)
        println(minOf(a,b,c))
    }

}
fun questionD5(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (x,y) = readLine()!!.split(" ").map(String::toString)
        println(Math.pow(x.toDouble(),y.toDouble()))
    }
}
fun questionD6(){
    var t = readLine()!!.toInt()
    repeat(t){
        var (x,y) = readLine()!!.split(" ").map(String::toString)
       for (i in x.toInt()..y.toInt()){
           println(i)
       }
    }
}


fun main(){
   questionD6()
}
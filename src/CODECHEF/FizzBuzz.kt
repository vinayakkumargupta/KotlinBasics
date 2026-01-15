package CODECHEF

fun fizzBuzz(n: Int): List<String> {
    var result = mutableListOf<String>()
    for(i in 1..n){
        if(i%3 == 0 || i%5 == 0){
            result.add("FizzBuzz")
        }else if(i%3 == 0){
            result.add("Fizz")
        }else if(i%5 == 0){
            result.add("Buzz")
        }else{
            result.add("$i")
        }
    }
    return result
}
fun mySqrt(x: Int): Int {
    if (x < 2) return x

    var r = x.toLong()

    while (r * r > x) {
        r = (r + x / r) / 2
    }

    return r.toInt()
}

fun main(){
    println(fizzBuzz(5))
}
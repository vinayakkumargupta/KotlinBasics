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

fun main(){
    println(fizzBuzz(5))
}
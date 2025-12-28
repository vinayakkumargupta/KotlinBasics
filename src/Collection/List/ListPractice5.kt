package Collection.List


//Q1. Convert a list of numbers into their squares

fun squareList(){
    val numbers = listOf(1, 2, 3, 4)
     println(numbers.map { it * it })
}

//Q2. Convert a list of prices to prices with 18% GST added

fun findGst(){
    val prices = listOf(100, 200, 300)
    val newPrices = prices.map{ it*(1.18)}
    println(newPrices)
}
//Q5. Get all words that start with 'a'

fun finda(){
    val words = listOf("apple", "banana", "avocado", "cat")

}


fun main(){
   squareList()
    findGst()
}
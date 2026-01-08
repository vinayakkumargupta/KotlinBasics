package LeetCodeProblems


//fun addPlus1(ar : IntArray) : IntArray{
//
//}
fun countPrimes(n: Int): Int {
    if (n <= 2) return 0

    val isPrime = BooleanArray(n) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2 until Math.sqrt(n.toDouble()).toInt() + 1) {
        if (isPrime[i]) {
            for (j in i * i until n step i) {
                isPrime[j] = false
            }
        }
    }

    return isPrime.count { it }
}

fun main(){
    println(countPrimes(12))

}
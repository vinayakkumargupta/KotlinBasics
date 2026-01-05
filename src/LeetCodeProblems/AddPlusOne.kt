package LeetCodeProblems


fun addPlus1( ar : IntArray) : IntArray{
    for(i in ar.size-1 downTo 0){
        if(ar[i]<9){
            ar[i]++
            return ar
        }
        ar[i]= 0
    }
    val result = IntArray(ar.size + 1)
    result[0] = 1
    return result
}


fun main(){
    println(addPlus1(intArrayOf(2,3,9)).joinToString())

}
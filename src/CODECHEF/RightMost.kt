package CODECHEF


//Given a array of length N
//Find the larget element in array store value in largest
//Find the rightmost index of largest element in right



fun rightMost(){
    val num = readLine()!!.split(" ").map(String::toInt).toIntArray()
    //find the largest
    val nu = intArrayOf()
    var largest = num[0]
    var right = 0
    for(i in 0 until num.size){
        if(largest<=num[i]){
            largest = num[i]
            right = i // index of largest num


        }
    }
    print(largest)
    print(right)
}




fun main(){
  rightMost()
}
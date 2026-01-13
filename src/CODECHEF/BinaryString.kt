package CODECHEF


//🧮 Binary Strings
//You are given two binary strings A and B of equal length.
//For each test case, you need to output the following:
//The count of '1' characters in string A
//The count of '1' characters in string B
//The count of indices i such that
//A[i] = B[i]
//📥 Input Format
//The first line contains an integer t — the number of test cases.
//For each test case:
//The first line contains the binary string A
//The second line contains the binary string B
//📤 Output Format
//For each test case, print one line containing three space-separated integers:

fun main(){
  BinaryString()
}


fun BinaryString(){
    var A = "10001"
    var B = "10000"
    var countIndices = 0
    var countA = 0
    var countB = 0

    for(i in 0 until A.length){
       if(A[i] == B[i]){
           countIndices++
       }
        if(A[i] == '1'){
            countA++
        }
        if(B[i] == '1'){
            countB++
        }
    }
    println("$countA $countB $countIndices")

}
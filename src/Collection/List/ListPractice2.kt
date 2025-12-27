package Collection.List



//Remove dupicate

fun removeDuplicate(){
    val num = listOf(1,2,2,3,4,4,5,6,)
    val seen = mutableSetOf<Int>()
    println(num.filter { seen.add(it) })

    //  use distinct

    println(num.distinct())
}

//Find min and max without using Built ins

fun minMax(){
    val prices = listOf(120,340,560,90,220)
    var max = prices[0]
    var min = prices[0]
    for(item in prices){
        if(item > max) max = item
        if(item < min) min = item
    }
    println("MAX :" + max)
    print("MIN : $min")
}

// Count Condition
// Count how many people are 18 or older

fun find18(){
    val age = listOf(12,18,21,16,30,25)
    var count = 0
    for(item in age){
        if(item >=18) count++
    }
    println(count)
}

// Sum of Even number only

fun sumOfEven(){
    val num = listOf(1,2,3,4,5,6)
    val sumEven = num.filter {
        it % 2 == 0
    }.sum()
    println(sumEven)
}

//Convert list of sting to uppercase

fun makeUpper(){
    val list = listOf("vinayak","rahul", "amit")
    var listname : MutableList<String> = mutableListOf()
     list.forEach {
         listname.add(it.uppercase())
     }
    println(listname)
}

fun main(){
    removeDuplicate()
    minMax()
    println()
    find18()
    sumOfEven()
    makeUpper()
}
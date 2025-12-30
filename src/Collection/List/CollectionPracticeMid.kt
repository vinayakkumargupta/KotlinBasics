package Collection.List

//🟡 Medium Level
//Count the frequency of each number in a list using a map.
//Find the first non-repeating element in a list.
//From a list of numbers, create a map where
//number → number * number.
//Find all elements that appear only once in a list.
//Given a sentence, count word frequency using a map.
//Merge two lists and remove duplicates.
//Find the maximum value in a list without using max().
//Group words by their first character.
//Convert a list of pairs into a map.
//Check if two lists contain the same elements ignoring order.

fun getGRouped(){
    val words = listOf("apple", "banana", "avocado", "cat")

    val grouped = words.groupBy { it.first() }
    println(grouped)

}


fun getMax(){
    val numbers = listOf(3, 7, 2, 9, 4)
    var max = numbers[0]
    for(i in numbers){
        if(i > max) max = i
    }
    println(max)
}


fun mergeList(){
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(3, 4, 5)
    val newList = list1+list2
    println(newList.distinct())
}

fun freqWord(){
    val sentence = "kotlin is fun and kotlin is powerful"
    val newMap = mutableMapOf<String, Int>()
    for(i in sentence.split(" " )){
        newMap[i] = newMap.getOrDefault(i,0)+1
    }
    println(newMap)
}


fun getAppearOnce(){
    val numbers = listOf(1, 2, 2, 3, 4, 4)
    val newMap = mutableMapOf<Int, Int>()
    for(i in numbers){
        newMap[i] = newMap.getOrDefault(i,0)+1

    }
    println(newMap.filter { it.value == 1 })
}

fun listToMap(){
    val numbers = listOf(2,3,4,5,6,7,8,96,5,4,3,2,2,1)
    val newMap = mutableMapOf<Int, Int>()
    for (i in numbers){
        newMap[i] = newMap.getOrDefault(i,i*i)
    }
    val filter = newMap.filter { it.value == 1 }
    println(filter.keys)
}


fun firstInlist(){
    val numbers = listOf(2,3,4,5,6,7,8,96,5,4,3,2,2,1)
    val firstUnique = numbers.firstOrNull { num ->
        // Count how many times 'num' appears in the whole list
        numbers.count { it == num } == 1
    }

    println(firstUnique)
}

fun countFreq(){
    val list = listOf(2,3,4,5,6,7,8,96,5,4,3,2,2,1)
    val newMap = mutableMapOf<Int, Int>()
    for(item in list){
        newMap[item] = newMap.getOrDefault(item,0)+1
    }
    println(newMap)
}

fun main(){
    countFreq()
    firstInlist()
    listToMap()
    getAppearOnce()
    freqWord()
    mergeList()
    getMax()
    getGRouped()
}
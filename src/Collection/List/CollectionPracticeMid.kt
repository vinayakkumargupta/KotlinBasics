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
}
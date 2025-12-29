package Collection.List.Maps



//1️⃣ Create Map from Two Lists
//Given two lists:
//val keys = listOf("A", "B", "C")
//val values = listOf(1, 2, 3)

fun getMapsfromList(){
    val keys = listOf("A", "B", "C")
    val values = listOf(1, 2, 3)
    val newMap = keys.zip(values).toMap()
    println(newMap)
}

//2️⃣ Count Frequency of Numbers
//Given a list:
//val numbers = listOf(1, 2, 2, 3, 3, 3, 4)

fun getFrequency(){
    val numbers = listOf(1, 2, 2,2, 3, 3, 3, 4)
    val newMap = mutableMapOf<Int, Int>()
    for(i in numbers){
        newMap[i] = newMap.getOrDefault(i,0) +1
    }
    println(newMap)

}
//3️⃣ Find Student with Highest Marks
//Given a map:
//val marks = mapOf("Rahul" to 75, "Amit" to 82, "Neha" to 90)

fun getSuHigestNum(){
    val marks = mapOf("Rahul" to 75, "Amit" to 82, "Neha" to 90)
    println(marks.maxByOrNull { it.value })
}
//4️⃣ Filter Values Greater Than 50
//Given a map:
//val scores = mapOf("A" to 45, "B" to 60, "C" to 80)
fun getGreater(){
    val scores = mapOf("A" to 45, "B" to 60, "C" to 80)
    println(scores.filter { it.value > 50
    })
}
//5️⃣ Increase Prices by 10%
//Given a map:
//val prices = mapOf("Pen" to 10, "Book" to 100)

fun increasePrice(){
    val prices = mapOf("Pen" to 10, "Book" to 100)
    val newPrice = prices.mapValues { it.value*(1.1) }
    println(newPrice)

}
//6️⃣ Group Words by Length
//Given a list:
//val words = listOf("cat", "dog", "elephant", "bat")
fun wordLength(){
    val words = listOf("cat", "dog", "elephant", "bat")

    val grouped = words.groupBy { it.length }
    println(grouped)

}
//7️⃣ Merge Two Maps
//Given two maps:
//val map1 = mapOf("A" to 1, "B" to 2)
//val map2 = mapOf("B" to 3, "C" to 4)
fun getMergeMap(){
    val map1 = mapOf("A" to 1, "B" to 2)
    val map2 = mapOf("B" to 3, "C" to 4)
    println(map1+map2)
}
//8️⃣ Remove Null Values
//Given a map:
//val data = mapOf("A" to 1, "B" to null, "C" to 3)

fun getNullValue(){
    val data = mapOf("A" to 1, "B" to null, "C" to 3)
    println(data.filterValues { it != null })
}
//9️⃣ Create Name-Length Map
//Given a list:
//val names = listOf("Vinayak", "Rahul", "Amit")

fun getNameLength(){
    val names = listOf("Vinayak", "Rahul", "Amit")
    println(names.associateWith { it.length })
}
//🔟 First Non-Repeating Character
//Given a string:
//val text = "swiss"

fun getNonRepeatingChar(){
    val text = "swiss"
    val freq = mutableMapOf<Char, Int>()

    for (ch in text) {
        freq[ch] = freq.getOrDefault(ch, 0) + 1
    }

    val result = text.firstOrNull { freq[it] == 1 }
    println(result)

}
fun main(){
  getMapsfromList()
    getFrequency()
    getSuHigestNum()
    getGreater()
    increasePrice()
    wordLength()
    getMergeMap()
    getNullValue()
    getNameLength()
    getNonRepeatingChar()
}
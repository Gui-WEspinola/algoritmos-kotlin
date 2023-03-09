package kyu6

fun main() {
    println(high("what time are we climbing up the volcano"))
}

fun high(str: String): String {

    val stringList = str.split(" ")
    var wordLengthList: ArrayList<Int> = ArrayList()

    for (word in stringList) {
        var charCount = 0
        word.lowercase().forEach { charCount += it.code - 96 }.also { wordLengthList.add(charCount) }

    }
    val maxValue = wordLengthList.maxOrNull()

    return stringList[wordLengthList.indexOf(maxValue)]
}
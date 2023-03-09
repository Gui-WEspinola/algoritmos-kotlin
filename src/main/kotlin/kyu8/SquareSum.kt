package kyu8

fun squareSum(n: Array<Int>): Int {
    var total = 0
    for (num in n) total += num * num
    return total
}

fun squareSumImproved(n: Array<Int>) = n.sumOf { it * it }

fun main() {
    var array = arrayOf(0,3,4,5)
    println(squareSum(array))
}
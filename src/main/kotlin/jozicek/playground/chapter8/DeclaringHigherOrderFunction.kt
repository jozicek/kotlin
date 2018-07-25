package jozicek.playground.chapter8

val sum: (Int, Int) -> Int = { x, y -> x + y }
val action: () -> Unit = { println(42) }

var canReturnNull: (Int, Int) -> Int? = { a, b -> null }

var functionOrNull: ((Int, Int) -> Int)? = null

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    twoAndThree(sum)
    twoAndThree { x, y -> x * y }
    println("ab1c".filter { it in 'a'..'z' })
}
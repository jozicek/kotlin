package jozicek.playground.chapter8

fun main(args: Array<String>) {
    val letters = listOf("Jozinko", "Karol")
    println(letters.joinToString())
    println(letters.joinToString { it.toUpperCase() })
}

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: (T) -> String = { it.toString() } // default toString is used
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

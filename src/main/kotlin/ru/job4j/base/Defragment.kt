package ru.job4j.base

fun defragment(array: Array<String?>) : Array<String?> {
    val current = arrayOfNulls<String?>(array.size)
    var counter = 0
    for (value in array) {
        if (value != null) {
            current[counter++] = value
        }
    }
    return current
}
package ru.job4j.base

fun draw(size: Int) {
    if (size < 1 || size % 2 == 0) {
        print("The input was incorrect! Please, enter an odd number which will be more than 0.")
        return
    }
    var result = ""
    for (outer in 1 .. size) {
        for (inner in 1 .. size) {
            result += if (outer == inner || inner == size - outer + 1) "x" else " "
        }
        println(result)
        result = ""
    }
}

fun main() {
    draw(11)
}
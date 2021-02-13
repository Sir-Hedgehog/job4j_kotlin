package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun multiply(first : Int, second : Int) : Int {
    return first * second
}

fun divide(first : Int, second : Int) : Int {
    return first / second
}

fun main() {
    val plus = add(8, 9)
    println("8 + 9 = $plus")

    val minus = subtract(9, 5)
    println("9 - 5 = $minus")

    val multiplication = multiply(7, 3)
    println("7 * 3 = $multiplication")

    val division = divide(18, 3)
    println("18 / 3 = $division")

    val complex = divide(
        multiply(
            add(17, 7), subtract(4, 1)
        ), 6)
    println("((17 + 7) * (4 - 1)) / 6 = $complex")
}
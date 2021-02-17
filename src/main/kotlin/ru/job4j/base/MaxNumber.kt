package ru.job4j.base

fun maxOfTwo(first: Int, second: Int) = if (first > second) first else second

fun maxOfThree(first: Int, second: Int, third: Int) : Int {
    return maxOfTwo(maxOfTwo(first, second), third);
}
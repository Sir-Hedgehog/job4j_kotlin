package ru.job4j.base

fun max(first: Int, second: Int, third: Int) : Any {
    return if (first > second && first > third) first
    else if (second > first && second > third) second
    else if (third > first && third > second) third
    else "absent"
}
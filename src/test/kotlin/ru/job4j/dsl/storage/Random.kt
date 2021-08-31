package ru.job4j.dsl.storage

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 29.08.2021
 */

class Random {

    fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }

    fun getRandomInt(length: Int) : String {
        val allowedChars = ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}
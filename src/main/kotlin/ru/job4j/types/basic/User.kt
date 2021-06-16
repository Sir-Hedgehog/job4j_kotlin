package ru.job4j.types.basic

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 10.06.2021
 */
data class User(var name: String = "", var password: String = "") {

    override fun toString(): String {
        return "User(name='$name', balance=$password)"
    }
}
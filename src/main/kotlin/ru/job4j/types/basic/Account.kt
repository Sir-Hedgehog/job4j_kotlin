package ru.job4j.types.basic

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 10.06.2021
 */
data class Account(var balance: Double = 0.0, var requisite: String = "") {

    override fun toString(): String {
        return "Account(balance=$balance, requisite=$requisite)"
    }
}
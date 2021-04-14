package ru.job4j.lambda.account

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.04.2021
 */
data class Account(var name: String = "", var balance: Double = 0.0) {

    override fun toString(): String {
        return "Account(name='$name', balance=$balance)"
    }
}
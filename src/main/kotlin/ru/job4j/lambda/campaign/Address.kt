package ru.job4j.lambda.campaign

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.04.2021
 */
data class Address(var city: String = "", var street: String = "", var house: String = "") {

    override fun toString(): String {
        return "$city, $street, $house"
    }
}
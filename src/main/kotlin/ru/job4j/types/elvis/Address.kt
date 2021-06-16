package ru.job4j.types.elvis

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 16.06.2021
 */
data class Address (var street: String, var home: String, var zip: Zip?) {

    override fun toString(): String {
        return "Address(street='$street', home='$home', zip=$zip)"
    }
}
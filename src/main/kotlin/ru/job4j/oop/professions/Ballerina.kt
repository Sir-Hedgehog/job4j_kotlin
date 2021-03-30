package ru.job4j.oop.professions

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 30.03.2021
 */
class Ballerina : Profession("dance", 10000.00) {

    override fun action(): String {
        return "Dance"
    }

    override fun getName(): String {
        return "Ballerina"
    }
}
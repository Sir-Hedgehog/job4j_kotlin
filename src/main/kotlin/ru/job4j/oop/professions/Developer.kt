package ru.job4j.oop.professions

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 30.03.2021
 */
class Developer : Profession("write code", 7500.00) {

    override fun action(): String {
        return "Write code"
    }

    override fun getName(): String {
        return "Developer"
    }
}
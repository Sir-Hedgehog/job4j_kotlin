package ru.job4j.oop.professions

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 30.03.2021
 */
open class Profession(val skill : String, val salary : Double) {

    open fun action(): String {
        return "Act"
    }

    open fun getName(): String {
        return "Get name"
    }
}
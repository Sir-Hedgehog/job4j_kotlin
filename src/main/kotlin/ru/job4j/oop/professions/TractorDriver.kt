package ru.job4j.oop.professions

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 30.03.2021
 */
class TractorDriver : Profession("drive", 5000.00) {

    override fun action(): String {
        return "Drive"
    }

    override fun getName(): String {
        return "Tractor Driver"
    }
}
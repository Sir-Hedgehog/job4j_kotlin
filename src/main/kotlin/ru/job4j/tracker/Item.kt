package ru.job4j.tracker

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 01.03.2021
 */
data class Item(var id: String = "", var name: String = "", var desc: String = "") {

    override fun toString(): String {
        return "Item(id='$id', name='$name', desc='$desc')"
    }
}
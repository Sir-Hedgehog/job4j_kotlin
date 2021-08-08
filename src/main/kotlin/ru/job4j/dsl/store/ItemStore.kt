package ru.job4j.dsl.store

import ru.job4j.oop.tracker.Item

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.08.2021
 */
class ItemStore: Store<Item> {

    /**
     * Метод реализации шаблона DAO
     */
    override fun save(model: Item): String {
        return "The item of " + model.name + " is saved!"
    }
}


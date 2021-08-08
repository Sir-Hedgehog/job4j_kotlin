package ru.job4j.dsl.store

import ru.job4j.oop.tracker.Item

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.08.2021
 */

/**
 * Реализация шаблона Active Record с помощью функции расширения
 */
fun Item.save() = ItemStore().save(Item(id, name, desc))
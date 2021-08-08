package ru.job4j.dsl.store

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.08.2021
 */
interface Store<T> {
    fun save(model: T): String
}
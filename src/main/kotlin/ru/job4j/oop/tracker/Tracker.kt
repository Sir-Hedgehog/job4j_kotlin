package ru.job4j.oop.tracker

import kotlin.math.abs
import kotlin.random.Random

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.3
 * @since 17.03.2021
 */
class Tracker {
    private val items = mutableListOf<Item>()

    companion object {
        val RANDOM = Random
    }

    /**
     * Метод генерирует уникальный ключ для заявки
     * @return уникальный ключ.
     */
    private fun generateId(): String {
        return abs(RANDOM.nextInt()).toString()
    }

    /**
     * Метод реализует добавление заявки в хранилище
     * @param item новая заявка
     * @return заявка
     */
    fun add(item: Item): Item {
        item.id = generateId()
        items.add(item)
        return item
    }

    /**
     * Метод обновляет заявку
     * @param item новая заявка
     * @param id идентификатор
     */
    fun update(id: String, item: Item): Boolean {
        var result = false;
        item.id = id
        for (index in 0 until items.size) {
            if (items[index].id == id) {
                items[index] = item
                result = true
                break
            }
        }
        return result
    }

    /**
     * Метод удаляет заявку
     * @param id идентификатор заявки
     */
    fun delete(id: String): Boolean {
        var result = false;
        for (index in 0 until items.size) {
            if (items[index].id == id) {
                items.removeAt(index)
                result = true
                break
            }
        }
        return result
    }

    /**
     * Метод выдает список всех заявок
     * @return список заявок
     */
    fun findAll(): List<Item> {
        return items.subList(0, items.size)
    }

    /**
     * Метод выдает список по имени
     * @param name вводится имя
     * @return существующая заявка по введенному имени
     */
    fun findByName(name: String): List<Item> {
        val result = mutableListOf<Item>()
        for (index in 0 until items.size) {
            if (items[index].name == name) {
                result.add(items[index])
            }
        }
        return result
    }

    /**
     * Метод выдает заявку по введенному идентификатору
     * @param id вводится идентификатор
     * @return существующая заявка по введенному идентификатору
     */
    fun findById(id: String): Item? {
        var result: Item? = null
        for (index in 0 until items.size) {
            if (items[index].id == id) {
                result = items[index]
                break
            }
        }
        return result
    }
}
package ru.job4j.tracker

import kotlin.random.Random

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.02.2021
 */
class Tracker {
    private val items: MutableList<Item> = ArrayList()

    companion object {
        val RANDOM = Random
    }

    /**
     * Метод генерирует уникальный ключ для заявки
     * @return уникальный ключ.
     */
    private fun generateId(): String {
        return RANDOM.nextInt().toString();
    }

    /**
     * Метод реализует добавление заявки в хранилище
     * @param item новая заявка
     * @return заявка
     */
    fun add(item: Item): Item {
        item.setId(generateId())
        items.add(item)
        return item;
    }

    /**
     * Метод обновляет заявку
     * @param item новая заявка
     * @param id идентификатор
     */
    fun update(id: String, item: Item): Boolean {
        var result = false;
        item.setId(id);
        for (index in 0 until items.size) {
            if (items[index].getId() == id) {
                items.set(index, item)
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
            if (items[index].getId() == id) {
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
        val result: MutableList<Item> = ArrayList()
        for (index in 0 until items.size) {
            if (items[index].getName().equals(name)) {
                result.add(items[index])
            }
        }
        return result
    }

    /**
     * Метод выдает список по имени
     * @param id вводится идентификатор
     * @return существующая заявка по введенному идентификатору
     */
    fun findById(id: String): Item? {
        var result: Item? = null
        for (index in 0 until items.size) {
            if (items[index].getId().equals(id)) {
                result = items[index]
                break
            }
        }
        return result
    }
}
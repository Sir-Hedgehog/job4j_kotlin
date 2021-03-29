package ru.job4j.oop.tracker

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 30.03.2021
 */
interface Action {

    /**
     * Метод инициализирует основные действия меню
     */
    fun init(tracker: Tracker)
}
package ru.job4j.oop.tracker

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.2
 * @since 30.03.2021
 */
class StartUI: Action {

    /**
     * Метод инициализирует основные действия меню
     */
    override fun init(tracker: Tracker) {
        do {
            getMenu()
            val elect = readLine()!!
            when (elect) {
                "1" -> addItem(tracker)
                "2" -> getAll(tracker)
                else -> {
                    if (elect != "3")
                        println("---------------< Enter a correct number >---------------")
                }
            }
        } while (exit(elect))
    }


    /**
     * Метод выводит в консоль основное меню
     */
    private fun getMenu() {
        println()
        println("---------------< Enter a number >---------------")
        println()
        println("1. Add item")
        println("2. Get all items")
        println("3. Exit")
    }

    /**
     * Метод дает возможность пользователю создать новую заявку
     */
    private fun addItem(tracker: Tracker) {
        val item = Item()
        println()
        println("---------------< Enter item name >---------------")
        val name = readLine()!!
        item.name = name
        println("---------------< Enter item description >---------------")
        val description = readLine()!!
        item.desc = description
        val result = tracker.add(item)
        println("---------------< New item with id " + result.id + " added! >---------------")
    }

    /**
     * Метод дает возможность пользователю получить все созданные заявки
     */
    private fun getAll(tracker: Tracker) {
        println()
        println("---------------< All items of tracker >---------------")
        tracker.findAll().forEach {
            println(it)
        }
    }

    /**
     * Метод дает возможность выйти из приложения
     */
    private fun exit(elect: String): Boolean {
        if (elect == "3") {
            println("---------------< See you soon >---------------")
            return false
        }
        return true
    }
}

/**
 * Запуск программы
 */
fun main() {
    StartUI().init(Tracker())
}

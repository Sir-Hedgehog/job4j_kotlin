package ru.job4j.dsl.store

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.oop.tracker.Item

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 08.08.2021
 */
class ItemTest : StringSpec({
    "Check Item saving"{
        val item = Item("1", "Franklin", "Dollars")
        val result = item.save()

        result shouldBe "The item of " + item.name + " is saved!"
    }
})
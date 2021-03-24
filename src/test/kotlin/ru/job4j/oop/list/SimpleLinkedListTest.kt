package ru.job4j.oop.list

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 24.03.2021
 */
class SimpleLinkedListTest : StringSpec({
    "Check to add entity and get"{
        val names = SimpleLinkedList<String>()
        names.add("Donald")
        names.get(0) shouldBe "Donald"
    }

    "Check to add some entities"{
        val names = SimpleLinkedList<String>()
        names.add("Donald")
        names.add("Max")
        names.add("Georg")
        names.get(1) shouldBe "Max"
    }

    "Check to add entities and delete one of its"{
        var counter = 0
        val names = SimpleLinkedList<String>()
        names.add("Donald")
        names.add("John")
        names.delete()
        while (names.iterator().hasNext()) {
            names.get(counter) shouldBe "Donald"
            names.iterator().next()
            counter++
        }
    }
})



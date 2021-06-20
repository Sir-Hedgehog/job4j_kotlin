package ru.job4j.types.safe

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import java.time.LocalDate

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 20.06.2021
 */
class ActionTest: StringSpec({
    "Check equality of same objects"{
        val first = Action()
        first.name = "Kevin"
        first.currency = "Dollar"
        first.date = LocalDate.of(2012, 3, 14)
        val second = Action()
        second.name = "Kevin"
        second.currency = "Dollar"
        second.date = LocalDate.of(2012, 3, 14)
        (first == second) shouldBe true
    }

    "Check hash code of same objects"{
        val first = Action()
        first.name = "Kevin"
        first.currency = "Dollar"
        first.date = LocalDate.of(2012, 3, 14)
        val second = Action()
        second.name = "Kevin"
        second.currency = "Dollar"
        second.date = LocalDate.of(2012, 3, 14)
        (first.hashCode() == second.hashCode()) shouldBe true
    }

    "Check equality of different objects"{
        val first = Action()
        first.name = "Kevin"
        first.currency = "Dollar"
        first.date = LocalDate.of(2012, 3, 14)
        val second = Action()
        second.name = "Kevin"
        second.currency = "Euro"
        second.date = LocalDate.of(2020, 5, 22)
        (first != second) shouldBe true
    }

    "Check hash code of different objects"{
        val first = Action()
        first.name = "Kevin"
        first.currency = "Dollar"
        first.date = LocalDate.of(2012, 3, 14)
        val second = Action()
        second.name = "Kevin"
        second.currency = "Euro"
        second.date = LocalDate.of(2020, 5, 22)
        (first.hashCode() != second.hashCode()) shouldBe true
    }
})
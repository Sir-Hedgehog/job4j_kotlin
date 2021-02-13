package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalculatorTest : StringSpec({
    "29 + 28 = 57" {
        add(29, 28) shouldBe 57
    }

    "99 - 77 = 22" {
        subtract(99, 77) shouldBe 22
    }

    "5 * 8 = 40" {
        multiply(5, 8) shouldBe 40
    }

    "121 / 11 = 11" {
        divide(121, 11) shouldBe 11
    }
})

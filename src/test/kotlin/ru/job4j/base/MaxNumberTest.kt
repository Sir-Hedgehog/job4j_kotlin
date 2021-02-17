package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxNumberTest : StringSpec({
    "Max number between 29, 28, 17 is 29" {
        maxOfThree(29, 28, 17) shouldBe 29
    }

    "Max number between 99, 100, 101 is 101" {
        maxOfThree(99, 100, 101) shouldBe 101
    }

    "Max number between 45, 55, 50 is 55" {
        maxOfThree(45, 55, 50) shouldBe 55
    }

    "Max number between 30, 30, 15 is absent" {
        maxOfThree(30, 30, 15) shouldBe 30
    }

    "Max number between 14, 100, 100 is absent" {
        maxOfThree(14, 100, 100) shouldBe 100
    }

    "Max number between -1, -2, -1 is absent" {
        maxOfThree(-1, -2, -1) shouldBe -1
    }

    "Max number between 7, 7, 7 is absent" {
        maxOfThree(7, 7, 7) shouldBe 7
    }
})
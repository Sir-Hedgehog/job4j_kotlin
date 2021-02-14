package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxNumberTest : StringSpec({
    "Max number between 29, 28, 17 is 29" {
        max(29, 28, 17) shouldBe 29
    }

    "Max number between 99, 100, 101 is 101" {
        max(99, 100, 101) shouldBe 101
    }

    "Max number between 45, 55, 50 is 55" {
        max(45, 55, 50) shouldBe 55
    }

    "Max number between 30, 30, 15 is absent" {
        max(30, 30, 15) shouldBe "absent"
    }

    "Max number between 14, 100, 100 is absent" {
        max(14, 100, 100) shouldBe "absent"
    }

    "Max number between -1, -2, -1 is absent" {
        max(-1, -2, -1) shouldBe "absent"
    }

    "Max number between 7, 7, 7 is absent" {
        max(7, 7, 7) shouldBe "absent"
    }
})
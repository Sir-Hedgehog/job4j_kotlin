package ru.job4j.lambda.sequences

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.05.2021
 */
class SequenceTest : StringSpec({
    "Check sequence"{
        val sequence = Sequence()
        val numbers = listOf(7, 9, 21, 29)
        val result = sequence.count(numbers)
        val expect = 38
        result shouldBe expect
    }

    "Check sequence number of 1"{
        val sequence = Sequence()
        val numbers = listOf(1, 4, 5, 6, 11, 13)
        val result = sequence.count(numbers)
        val expect = 34
        result shouldBe expect
    }

    "Check sequence with number of 0"{
        val sequence = Sequence()
        val numbers = listOf(0, 2, 4, 5, 27)
        val result = sequence.count(numbers)
        val expect = 9
        result shouldBe expect
    }

    "Check sequence with negative number"{
        val sequence = Sequence()
        val numbers = listOf(-5, 1)
        val result = sequence.count(numbers)
        val expect = 2
        result shouldBe expect
    }

    "Check sequence where elect numbers are absent"{
        val sequence = Sequence()
        val numbers = listOf(-5, 4)
        val result = sequence.count(numbers)
        val expect = 0
        result shouldBe expect
    }
})
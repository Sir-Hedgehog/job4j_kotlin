package ru.job4j.lambda

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 11.04.2021
 */
class LambdaDemoTest : StringSpec({
    "Check the decrement"{
        LambdaDemo().decrement(1) shouldBe 0
    }

    "Check the square number"{
        LambdaDemo().squareNumber(7) shouldBe 49
    }
})
package ru.job4j.oop.professions

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 30.03.2021
 */
class TrackerTest : StringSpec({
    "Check profession of developer" {
        val developer = Developer()
        developer.getName() shouldBe "Developer"
        developer.action() shouldBe "Write code"
    }

    "Check profession of ballerina" {
        val ballerina = Ballerina()
        ballerina.getName() shouldBe "Ballerina"
        ballerina.action() shouldBe "Dance"
    }

    "Check profession of tractor driver" {
        val driver = TractorDriver()
        driver.getName() shouldBe "Tractor Driver"
        driver.action() shouldBe "Drive"
    }
})
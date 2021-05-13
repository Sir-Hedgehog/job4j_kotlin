package ru.job4j.lambda.messages

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 13.05.2021
 */
class EmailServiceTest : StringSpec({
    "Check email service"{
        val service = EmailService()
        val result = service.sendTo(Message("Leonid", "leonid@mail.ru"))
        val expect = "Subject : leonid@mail.ruBody : Hello, Leonid! You win!"
        result shouldBe expect
    }
})
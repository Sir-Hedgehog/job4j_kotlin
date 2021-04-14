package ru.job4j.lambda.account

import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.04.2021
 */
class AccountFilterTest : StringSpec({
    "Check filter"{
        val accounts = listOf(
            Account("Samuel", 123.0),
            Account("Ivan", -123.0),
            Account("Ivan", 0.12),
            Account("Petr", 0.0),
            Account("Ivan", 777.0),
        )

        val accountFilter = AccountFilter()
        val result = accountFilter.filter(accounts)

        result.size shouldBe 2
        result[0].name shouldBe "Ivan"
        result[1].name shouldBe "Ivan"
        result shouldContain Account("Ivan", 0.12)
        result shouldContain Account("Ivan", 777.0)
    }
})
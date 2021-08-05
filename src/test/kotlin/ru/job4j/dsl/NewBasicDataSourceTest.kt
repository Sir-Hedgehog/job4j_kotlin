package ru.job4j.dsl

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.08.2021
 */
class NewBasicDataSourceTest : StringSpec({
    "Check NewBasicDataSource builder"{
        val newBasicDataSource = NewBasicDataSource
            .driverClassName("org.postgres.Driver")
            .url("localhost")
            .username("postgres")
            .password("password")
            .minIdle(5)
            .maxIdle(10)
            .maxOpenPreparedStatements(100)
            .build()

        newBasicDataSource.print() shouldBe "NewBasicDataSource(org.postgres.Driver, localhost, postgres, password, 5, 10, 100)"
    }
})
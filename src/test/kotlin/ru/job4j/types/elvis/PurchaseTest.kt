package ru.job4j.types.elvis

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import java.time.LocalDate

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 16.06.2021
 */
class PurchaseTest : StringSpec({
    "Check generation if address is null"{
        val purchase = Purchase("Иван", LocalDate.of(2021, 6, 16), null)
        val generation = HtmlGeneration()
        val result = generation.generate(purchase)
        val expect = "<purchase>" +
                        "<name>Иван</name>" +
                        "<date>2021-06-16</date>" +
                        "<address>" +
                            "<street></street>" +
                            "<home></home>" +
                            "<zip>" +
                                "<code></code>" +
                            "</zip>" +
                        "</address>" +
                    "</purchase>"
        result shouldBe expect
    }

    "Check generation if address zip is null"{
        val address = Address("ул. Никольская", "д. 145", null)
        val purchase = Purchase("Иван", LocalDate.of(2021, 6, 16), address)
        val generation = HtmlGeneration()
        val result = generation.generate(purchase)
        val expect = "<purchase>" +
                        "<name>Иван</name>" +
                        "<date>2021-06-16</date>" +
                        "<address>" +
                            "<street>ул. Никольская</street>" +
                            "<home>д. 145</home>" +
                            "<zip>" +
                                "<code></code>" +
                            "</zip>" +
                        "</address>" +
                    "</purchase>"
        result shouldBe expect
    }

    "Check generation if address is not null"{
        val zip = Zip()
        zip.code = 124
        val address = Address("ул. Никольская", "д. 145", zip)
        val purchase = Purchase("Иван", LocalDate.of(2021, 6, 16), address)
        val generation = HtmlGeneration()
        val result = generation.generate(purchase)
        val expect = "<purchase>" +
                        "<name>Иван</name>" +
                        "<date>2021-06-16</date>" +
                        "<address>" +
                            "<street>ул. Никольская</street>" +
                            "<home>д. 145</home>" +
                            "<zip>" +
                                "<code>124</code>" +
                            "</zip>" +
                        "</address>" +
                    "</purchase>"
        result shouldBe expect
    }
})
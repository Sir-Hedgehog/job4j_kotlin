package ru.job4j.lambda.html

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 12.05.2021
 */
class SequenceTest : StringSpec({
    "Check table 2*3"{
        val table = HtmlTable()
        val result = table.create(2, 3)
        val expect = "<table><tr><td></td><td></td><td></td></tr><tr><td></td><td></td><td></td></tr></table>"
        result shouldBe expect
    }

    "Check table 1*0"{
        val table = HtmlTable()
        val result = table.create(1, 0)
        val expect = "<table><tr></tr></table>"
        result shouldBe expect
    }

    "Check table 0*0"{
        val table = HtmlTable()
        val result = table.create(0, 0)
        val expect = "<table></table>"
        result shouldBe expect
    }
})
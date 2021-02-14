package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class DefragmentTest : StringSpec({
    "Array of toys is sorted!" {
        val toys =  arrayOfNulls<String>(10)
        toys[0] = "Ball"
        toys[3] = "Doll"
        toys[5] = "Teddy bear"
        toys[9] = "Tin soldier"
        val result =  arrayOfNulls<String>(10)
        result[0] = "Ball"
        result[1] = "Doll"
        result[2] = "Teddy bear"
        result[3] = "Tin soldier"
        defragment(toys) shouldBe result
    }

    "Array of processors is sorted!" {
        val processors =  arrayOfNulls<String>(5)
        processors[2] = "AMD"
        processors[4] = "Intel"
        val result =  arrayOfNulls<String>(5)
        result[0] = "AMD"
        result[1] = "Intel"
        defragment(processors) shouldBe result
    }

    "Array of countries is sorted!" {
        val countries =  arrayOfNulls<String>(10)
        countries[7] = "Brazil"
        countries[8] = "Spain"
        countries[9] = "China"
        val result =  arrayOfNulls<String>(10)
        result[0] = "Brazil"
        result[1] = "Spain"
        result[2] = "China"
        defragment(countries) shouldBe result
    }
})
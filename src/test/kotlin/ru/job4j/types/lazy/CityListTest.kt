package ru.job4j.types.lazy

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.08.2021
 */
class CityListTest: StringSpec({
    "Check by lazy"{
        val cityList = CityList()

        cityList.ussrCities.toString() shouldBe "[Moscow, Minsk, Kiev, Yerevan, Baku, " +
                "Tallinn, Tbilisi, Alma-Ata, Frunze, Riga, " +
                "Vilnius, Kishinev, Dushanbe, Ashkhabad, Tashkent]"
    }
})
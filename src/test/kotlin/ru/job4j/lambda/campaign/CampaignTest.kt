package ru.job4j.lambda.campaign

import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.specs.StringSpec
import java.time.LocalDate

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.04.2021
 */
class CampaignTest : StringSpec({
    "Check lambda map"{
        val mapping = Mapping()
        val campaign = Campaign("job4j", Address("г. Брянск", "ул. Московская", "д.63"), LocalDate.parse("2015-12-12"))
        println(mapping.map(campaign))
        val resultList = mapping.map(campaign)
        resultList shouldContain "job4j"
        resultList shouldContain "г. Брянск, ул. Московская, д.63"
        resultList shouldContain "2015-12-12"
    }
})
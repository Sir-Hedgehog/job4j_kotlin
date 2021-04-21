package ru.job4j.lambda.campaign

import java.time.LocalDate

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.04.2021
 */
data class Campaign(var name: String, var address: Address, var created: LocalDate)
package ru.job4j.lambda.campaign

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.04.2021
 */
class Mapping {

    /**
     * Метод реализует преобразование данных компании в список строк
     * @param campaign - данные о компании
     * @return - список строк
     */
    fun map(campaign: Campaign): List<String> {
        val list = listOf(campaign.name, campaign.address, campaign.created)
        return list.map { element -> "$element" }
    }
}
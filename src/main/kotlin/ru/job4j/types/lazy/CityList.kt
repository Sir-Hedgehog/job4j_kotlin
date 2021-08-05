package ru.job4j.types.lazy

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.08.2021
 */
class CityList {
    val ussrCities : List<String> by lazy { loadCities() }

    /**
     * Метод загружает список столиц СНГ
     */
    private fun loadCities() : List<String> = listOf(
        "Moscow", "Minsk", "Kiev", "Yerevan", "Baku", "Tallinn", "Tbilisi", "Alma-Ata",
        "Frunze", "Riga", "Vilnius", "Kishinev", "Dushanbe", "Ashkhabad", "Tashkent"
    )
}
package ru.job4j.types.lazy

class CityList {
    val ussrCities : List<String> by lazy { loadCities() }

    private fun loadCities() : List<String> = listOf(
        "Moscow", "Minsk", "Kiev", "Yerevan", "Baku", "Tallinn", "Tbilisi", "Alma-Ata",
        "Frunze", "Riga", "Vilnius", "Kishinev", "Dushanbe", "Ashkhabad", "Tashkent"
    )
}
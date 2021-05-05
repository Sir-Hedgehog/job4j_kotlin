package ru.job4j.lambda.sequences

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.05.2021
 */
class Sequence {

    /**
     * Метод находит простые числа, прибавляет к каждому единицу и складывает их
     * @param list - список чисел
     * @return - результирующее число
     */
    fun count(list: List<Int>): Int {
        return list
            .stream()
            .filter { it >= 1 && findPrimeNumber(it) }
            .map { it + 1 }
            .reduce { sum, element -> sum + element }.orElse(0)
    }

    /**
     * Метод проверяет число: простое оно или нет
     * @param number - входящее число
     * @return - простое число или нет
     */
    private fun findPrimeNumber(number: Int): Boolean {
        for (element in 1..number) {
            if (number % element == 0 && element != 1 && number != element) {
                return false
            }
        }
        return true
    }
}
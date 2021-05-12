package ru.job4j.lambda.html

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 12.05.2021
 */
class HtmlTable {

    /**
     * Метод создает пустую таблицу с заданным количеством строк и ячеек
     * @return - пустая таблица
     */
    fun create(row: Int, cell: Int): String {
        val table = StringBuilder()

        table.apply {
            append("<table>")
                for (currentRow in 1..row) {
                    append("<tr>")
                    for (currentCell in 1..cell) {
                        append("<td></td>")
                    }
                    append("</tr>")
                }
            append("</table>")
        }

        return table.toString()
    }
}
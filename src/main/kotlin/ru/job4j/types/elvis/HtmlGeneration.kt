package ru.job4j.types.elvis

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 16.06.2021
 */
class HtmlGeneration {

    /**
     * Метод генерирует html-отображение информации о точке доставки товара
     */

    fun generate(purchase: Purchase): String {
        val information = StringBuilder()

        information.apply {
            append("<purchase>")
                append("<name>")
                    append(purchase.name)
                append("</name>")
                append("<date>")
                    append(purchase.created.toString())
                append("</date>")
                append("<address>")
                    append("<street>")
                        append(purchase.address?.street  ?: "")
                    append("</street>")
                    append("<home>")
                        append(purchase.address?.home ?: "")
                    append("</home>")
                    append("<zip>")
                        append("<code>")
                            append(purchase.address?.zip?.code  ?: "")
                        append("</code>")
                    append("</zip>")
                append("</address>")
            append("</purchase>")
        }

        return information.toString()
    }
}
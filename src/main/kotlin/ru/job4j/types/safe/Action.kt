package ru.job4j.types.safe

import java.time.LocalDate

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 20.06.2021
 */
class Action {
    var name: String? = null
    var currency: String? = null
    var date: LocalDate? = null

    override fun equals(other: Any?): Boolean {
        if (other == null) return false

        if (name != (other as Action).name) return false
        if (currency != other.currency) return false
        if (date != other.date) return false

        return true
    }

    override fun hashCode(): Int {
        var result = if (date == null) 17 else date.hashCode()
        result = 31 * result + currency.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}
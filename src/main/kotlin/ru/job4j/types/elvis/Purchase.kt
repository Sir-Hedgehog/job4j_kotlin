package ru.job4j.types.elvis

import java.time.LocalDate

data class Purchase(var name: String = "", var created: LocalDate, var address: Address?) {

    override fun toString(): String {
        return "Purchase(name='$name', created=$created, address=$address)"
    }
}
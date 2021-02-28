package ru.job4j.tracker

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.02.2021
 */
class Item {
    private var id: String = ""
    private var name: String? = null
    private var desc: String? = null

    constructor(name: String?, desc: String?) {
        this.name = name
        this.desc = desc
    }

    constructor()

    fun setId(value: String) {
        id = value
    }

    fun getId(): String {
        return id
    }

    fun setName(value: String?) {
        name = value
    }

    fun getName(): String? {
        return name
    }

    fun setDesc(value: String?) {
        desc = value
    }

    fun getDesc(): String? {
        return desc
    }

    override fun toString(): String {
        return "Item(id='$id', name='$name', desc='$desc')"
    }
}
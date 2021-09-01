package ru.job4j.dsl.storage

import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.oop.tracker.Item

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 01.09.2021
 */
class StorageTest: StringSpec({
    "Check to create(), findById(), deleteAll()"{
        val store = Storage()
        val random = Random()
        val itemId = random.getRandomInt(3)
        val itemName = random.getRandomString(6)
        val itemDesc = random.getRandomString(50)

        val item = Item(id = itemId, name = itemName, desc = itemDesc)

        val createdSuccess = store create item
        createdSuccess shouldBe true

        val savedItem = store findById itemId
        savedItem shouldBe item

        val deletedSuccess = store.deleteAll()
        deletedSuccess shouldBe true

        val deletedItem = store findById itemId
        deletedItem shouldBe null
    }

    "Check to selectAll()"{
        val store = Storage()
        val random = Random()

        val firstItem = Item(id = random.getRandomInt(3), name = random.getRandomString(6), desc = random.getRandomString(50))
        val secondItem = Item(id = random.getRandomInt(3), name = random.getRandomString(6), desc = random.getRandomString(50))

        val firstCreatedSuccess = store create firstItem
        firstCreatedSuccess shouldBe true
        val secondCreatedSuccess = store create secondItem
        secondCreatedSuccess shouldBe true

        val items = store.findAll()
        items shouldContain firstItem
        items shouldContain secondItem

        store.deleteAll()
    }

    "Check to update()"{
        val store = Storage()
        val random = Random()
        val itemId = random.getRandomInt(3)

        val newItem = Item(id = itemId, name = random.getRandomString(6), desc = random.getRandomString(50))
        val renewItem = Item(id = itemId, name = random.getRandomString(8), desc = random.getRandomString(70))

        val createdSuccess = store create newItem
        createdSuccess shouldBe true

        val createdItem = store findById itemId
        createdItem shouldBe newItem

        val updatedSuccess = store update renewItem
        updatedSuccess shouldBe true

        val updatedItem = store findById itemId
        updatedItem shouldBe renewItem

        store.deleteAll()
    }

    "Check to delete()"{
        val store = Storage()
        val random = Random()
        val itemId = random.getRandomInt(3)
        val itemName = random.getRandomString(6)
        val itemDesc = random.getRandomString(50)

        val newItem = Item(id = itemId, name = itemName, desc = itemDesc)

        val createdSuccess = store create newItem
        createdSuccess shouldBe true

        val createdItem = store findById itemId
        createdItem shouldBe newItem

        val updatedSuccess = store delete itemId
        updatedSuccess shouldBe true

        val updatedItem = store findById itemId
        updatedItem shouldBe null

        store.deleteAll()
    }
})
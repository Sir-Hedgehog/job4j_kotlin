package ru.job4j.tracker

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 01.03.2021
 */
class TrackerTest : StringSpec({
    "Check to add and find all in tracker of items" {
        val tracker = Tracker()
        val item = Item(name = "Item #1", desc = "Description")
        tracker.add(item)
        tracker.findAll().size shouldBe 1
        tracker.findAll()[0].name shouldBe "Item #1"
        tracker.findAll()[0].desc shouldBe "Description"
    }

    "Check to update, find all and find by name in tracker of items" {
        val tracker = Tracker()
        val item1 = Item(name = "Item #1")
        tracker.add(item1)
        val item2 = Item(name = "Item #2")
        tracker.update(tracker.findAll()[0].id, item2)
        tracker.findAll().size shouldBe 1
        tracker.findByName("Item #1").size shouldBe 0
        tracker.findByName("Item #2").size shouldBe 1
    }

    "Check to delete, find all, find by id in tracker of items" {
        val tracker = Tracker()
        val item = Item(name = "Item #1")
        val saved = tracker.add(item)
        tracker.findAll().size shouldBe 1
        tracker.delete(saved.id)
        tracker.findById(saved.id) shouldBe null
        tracker.findAll().size shouldBe 0
    }
})
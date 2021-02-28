package ru.job4j.tracker

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TrackerTest : StringSpec({
    "Check to add and find all in tracker of items" {
        val tracker = Tracker()
        val item = Item()
        item.setName("Item #1")
        item.setDesc("Description")
        tracker.add(item)
        tracker.findAll().size shouldBe 1
        tracker.findAll()[0].getName() shouldBe "Item #1"
        tracker.findAll()[0].getDesc() shouldBe "Description"
    }

    "Check to update, find all and find by name in tracker of items" {
        val tracker = Tracker()
        val item1 = Item()
        item1.setName("Item #1")
        tracker.add(item1)
        val item2 = Item()
        item2.setName("Item #2")
        tracker.update(tracker.findAll()[0].getId(), item2)
        tracker.findAll().size shouldBe 1
        tracker.findByName("Item #1").size shouldBe 0
        tracker.findByName("Item #2").size shouldBe 1
    }

    "Check to delete, find all, find by id in tracker of items" {
        val tracker = Tracker()
        val item = Item()
        item.setName("Item #1")
        val saved = tracker.add(item)
        tracker.findAll().size shouldBe 1
        tracker.delete(saved.getId())
        tracker.findById(saved.getId()) shouldBe null
        tracker.findAll().size shouldBe 0
    }
})
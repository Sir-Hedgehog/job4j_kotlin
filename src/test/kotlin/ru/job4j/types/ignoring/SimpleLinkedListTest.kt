package ru.job4j.types.ignoring

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.07.2021
 */
class SimpleLinkedListTest : StringSpec({
    "Check to add(), hasNext() and next()"{
        val docker = "docker"
        val cucumber = "cucumber"
        val spark = "spark"

        val technologies = SimpleLinkedList<String>()
        technologies.add(docker)
        technologies.add(cucumber)
        technologies.add(spark)

        technologies.hasNext() shouldBe true
        technologies.next() shouldBe docker
        technologies.hasNext() shouldBe true
        technologies.next() shouldBe cucumber
        technologies.hasNext() shouldBe true
        technologies.next() shouldBe spark
        technologies.hasNext() shouldBe false
    }

    "Check to add(), hasPrevious() and previous()"{
        val docker = "docker"
        val cucumber = "cucumber"
        val spark = "spark"

        val technologies = SimpleLinkedList<String>()
        technologies.add(docker)
        technologies.add(cucumber)
        technologies.add(spark)

        technologies.hasPrevious() shouldBe true
        technologies.previous() shouldBe spark
        technologies.hasPrevious() shouldBe true
        technologies.previous() shouldBe cucumber
        technologies.hasPrevious() shouldBe true
        technologies.previous() shouldBe docker
        technologies.hasPrevious() shouldBe false
    }

    "Check to add(), nextIndex() and previousIndex()"{
        val docker = "docker"
        val cucumber = "cucumber"
        val spark = "spark"

        val technologies = SimpleLinkedList<String>()
        technologies.add(docker)
        technologies.add(cucumber)
        technologies.add(spark)

        technologies.nextIndex() shouldBe 3
        technologies.previousIndex() shouldBe 1
    }
})
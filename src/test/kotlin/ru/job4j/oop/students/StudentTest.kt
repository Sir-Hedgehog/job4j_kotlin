package ru.job4j.oop.students

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 06.03.2021
 */
class StudentTest: StringSpec({
    "Check constructor of name" {
        val input = "John"
        val student = Student(name = input)
        student.name shouldBe input
    }

    "Check constructor of surname" {
        val input = "Holden"
        val student = Student(surname = input)
        student.surname shouldBe input
    }

    "Check constructor of phone" {
        val input = "+7(917)092-99-00"
        val student = Student(phone = input)
        student.phone shouldBe input
    }

    "Check constructor of email" {
        val input = "hack@bug.com"
        val student = Student(email = input)
        student.email shouldBe input
    }
})
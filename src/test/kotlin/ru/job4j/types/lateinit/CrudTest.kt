package ru.job4j.types.lateinit

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 30.07.2021
 */
class CrudTest: StringSpec({
    "Check to insert"{
        val crud = Crud()

        crud.init()
        crud.execute("INSERT INTO languages (language) VALUES ('java')") shouldBe false
        crud.exit()
    }

    "Check to select"{
        val crud = Crud()

        crud.init()
        crud.execute("SELECT * from languages") shouldBe true
        crud.exit()
    }

    "Check to update"{
        val crud = Crud()

        crud.init()
        crud.execute("UPDATE languages SET language = 'python' WHERE id = 1") shouldBe false
        crud.exit()
    }

    "Check to delete"{
        val crud = Crud()

        crud.init()
        crud.execute("DELETE from languages") shouldBe false
        crud.exit()
    }
})
package ru.job4j.types

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 10.06.2021
 */
class BankServiceTest : StringSpec({

    "Find user by password - get user who is present" {
        val bank = BankService()
        bank.addUser(User("John Robert Holden", "password"))
        val user = bank.findByPassport("password")
        user?.name shouldBe "John Robert Holden"
    }

    "Find user by password - user is absent" {
        val bank = BankService()
        bank.addUser(User("John Robert Holden", "password"))
        val user = bank.findByPassport("pass")
        user?.name shouldBe null
    }

    "Find account by requisite - account is present" {
        val bank = BankService()
        bank.addUser(User("John Robert Holden", "password"))
        bank.addAccount("password", Account(123.0, "173RE3"))
        val account = bank.findByRequisite("password", "173RE3")
        account?.balance shouldBe 123.0
    }

    "Find account by requisite - account is absent" {
        val bank = BankService()
        bank.addUser(User("John Robert Holden", "password"))
        bank.addAccount("password", Account(123.0, "173RE3"))
        val account = bank.findByRequisite("word", "173")
        account?.balance shouldBe null
    }

    "Success to transfer money" {
        val bank = BankService()

        bank.addUser(User("John Robert Holden", "password"))
        bank.addAccount("password", Account(123.0, "173RE3"))

        bank.addUser(User("Lebron James", "pass"))
        bank.addAccount("pass", Account(567.0, "38IUT5"))

        val transaction = bank.transferMoney("pass", "38IUT5", "password", "173RE3", 167.0)
        val johnAccount = bank.findByRequisite("password", "173RE3")
        val lebronAccount = bank.findByRequisite("pass", "38IUT5")

        transaction shouldBe true
        johnAccount?.balance shouldBe 290.0
        lebronAccount?.balance shouldBe 400.0
    }

    "Failed money transfer " {
        val bank = BankService()

        bank.addUser(User("John Robert Holden", "password"))
        bank.addAccount("password", Account(123.0, "173RE3"))

        bank.addUser(User("Lebron James", "pass"))
        bank.addAccount("pass", Account(567.0, "38IUT5"))

        val transaction = bank.transferMoney("word", "1232343", "old", "1232132", 999999.9)
        val johnAccount = bank.findByRequisite("password", "173RE3")
        val lebronAccount = bank.findByRequisite("pass", "38IUT5")

        transaction shouldBe false
        johnAccount?.balance shouldBe 123.0
        lebronAccount?.balance shouldBe 567.0
    }
})
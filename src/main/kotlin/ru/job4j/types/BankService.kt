package ru.job4j.types

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 10.06.2021
 */
class BankService {
    private val users = mutableMapOf<User, ArrayList<Account>>()

    fun addUser(user: User) {
        users.putIfAbsent(user, arrayListOf())
    }

    fun findByRequisite(password: String, requisite: String): Account? {
        val user = findByPassport(password)
        return users[user]?.first { it.requisite == requisite }
    }

    fun addAccount(password: String, account: Account) {
        val user = findByPassport(password)
        users[user]?.add(account)
    }

    fun findByPassport(password: String): User? {
        return users.keys.firstOrNull { it.password == password }
    }

    fun transferMoney(srcPassword: String, srcRequisite: String, destPassword: String, descRequisite: String, amount: Double): Boolean {

        val source = findByRequisite(srcPassword, srcRequisite)
        val destination = findByRequisite(destPassword, descRequisite)
        val result = source != null && destination != null

        if (result) {
            source?.balance = source?.balance!! - amount
            destination?.balance = destination?.balance!! + amount
        }

        return result
    }
}
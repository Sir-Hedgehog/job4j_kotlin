package ru.job4j.lambda.account

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 14.04.2021
 */
class AccountFilter {

    /**
     * Метод реализует фильтрацию списка аккаунтов
     * @param accounts - список аккаунтов
     * @return - отфильтрованный список аккаунтов
     */
    fun filter(accounts: List<Account>): List<Account> {
        return accounts.filter { it.name == "Ivan" && it.balance > 0 }
    }
}
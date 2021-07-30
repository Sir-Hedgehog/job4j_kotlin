package ru.job4j.types.lateinit

import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 30.07.2021
 */
class Crud {
    private lateinit var connection : Connection
    private val username = "postgres"
    private val password = "password"
    private val url = "jdbc:postgresql://localhost:5432/Languages?loggerLevel=TRACE"

    /**
     * Метод инициализирует соединение с базой данных с подключенными логами
     */
    fun init() {
        Class.forName("org.postgresql.Driver")
        connection = DriverManager.getConnection(url, username, password)
    }

    /**
     * Метод делает запрос в базу данных
     * @return - возвращает проверку наличия resultSet в зависимости от запроса
     */
    fun execute(sql: String): Boolean {
        if (!validate(sql)) {
            throw Exception("The command of $sql is absent!")
        }

        val statement: Statement = connection.createStatement()
        val result = statement.execute(sql)
        statement.close()

        return result
    }

    /**
     * Метод проверяет запрос на корректность
     */
    private fun validate(sql : String): Boolean {
        val templateSql = sql.toLowerCase()
        var result = false

        if (templateSql.contains("select") ||
            templateSql.contains("insert") ||
            templateSql.contains("update") ||
            templateSql.contains("delete")) {

            result = true
        }

        return result
    }

    /**
     * Выход из соединения с базой данных
     */
    fun exit() {
        connection.close()
    }
}

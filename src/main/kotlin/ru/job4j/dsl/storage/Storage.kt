package ru.job4j.dsl.storage

import ru.job4j.oop.tracker.Item
import java.sql.*
import java.util.ArrayList

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 2.0
 * @since 01.03.2021
 */
class Storage {
    private lateinit var connection: Connection
    private val username = "postgres"
    private val password = "password"
    private val url = "jdbc:postgresql://localhost:5432/Items"

    /**
     * Метод инициализирует соединение с базой данных с подключенными логами
     */
    private fun init() {
        Class.forName("org.postgresql.Driver")
        connection = DriverManager.getConnection(url, username, password)
    }

    /**
     * Выход из соединения с базой данных
     */
    private fun exit() {
        connection.close()
    }

    /**
     * Метод формирует общий интерфейс для всех операций с БД (шаблон "Команда")
     * @param sql - sql-запрос
     * @return - ответ на запрос
     */
    private fun <T> command(sql: String, block: (ps: PreparedStatement) -> T): T {
        init()
        val ps = connection.prepareStatement(sql)
        val model = block(ps)
        ps.close()
        exit()
        return model
    }

    /**
     * Метод создает заявку
     * @param item - заявка
     * @return - успешность операции
     */
    infix fun create(item: Item): Boolean =
        command("INSERT INTO items(id, name, description) VALUES (?, ?, ?)") { ps ->
                ps.setInt(1, item.id.toInt())
                ps.setString(2, item.name)
                ps.setString(3, item.desc)
                ps.executeUpdate()
            true
        }

    /**
     * Метод обновляет заявку
     * @param item - заявка
     * @return - успешность операции
     */
    infix fun update(item: Item): Boolean =
        command("UPDATE items SET name = ?, description = ? WHERE id = ?") { ps ->
                ps.setString(1, item.name)
                ps.setString(2, item.desc)
                ps.setInt(3, item.id.toInt())
                ps.executeUpdate()
            true
        }

    /**
     * Метод удаляет заявку по идентификатору
     * @param id - идентификатор
     * @return - успешность операции
     */
    infix fun delete(id: String): Boolean =
        command("DELETE FROM items WHERE id = ?") { ps ->
                ps.setInt(1, id.toInt())
                ps.executeUpdate()
            true
        }

    /**
     * Метод выдает список по идентификатору
     * @param id - идентификатор
     * @return - существующая заявка по введенному идентификатору
     */
    infix fun findById(id: String): Item? =
        command("SELECT * FROM items WHERE id = ?") {
                ps ->
                    ps.setInt(1, id.toInt())
                    val rs = ps.executeQuery()
                    while (rs.next()) {
                        val itemId = rs.getInt(1).toString()
                        val itemName = rs.getString("name")
                        val itemDescription = rs.getString("description")

                        val item = Item(itemId, itemName, itemDescription)
                        if (id == itemId) {
                            return@command item
                        }
                    }
            return@command null
    }

    /**
     * Метод выдает список всех заявок
     * @return - список заявок
     */
    fun findAll(): List<Item> {
        val list: MutableList<Item> = ArrayList()

        command("SELECT * FROM items") { ps ->
            val rs = ps.executeQuery()
            while (rs.next()) {
                val item = Item(rs.getString("id"), rs.getString("name"), rs.getString("description"))
                list.add(item)
            }
        }

        return list
    }

    fun deleteAll(): Boolean =
        command("DELETE FROM items") { ps ->
            ps.executeUpdate()
            true
        }
}
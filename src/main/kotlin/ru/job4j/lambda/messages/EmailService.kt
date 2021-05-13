package ru.job4j.lambda.messages

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 13.05.2021
 */
class EmailService {

    /**
     * Метод отправляет шаблон письма с данными получателя
     * @param message - данные получателя
     * @return - шаблон письма
     */
    fun sendTo(message: Message): String {
        return with(StringBuilder()) {
            append("Subject : ").append(message.email)
            append("Body : ").append("Hello, ").append(message.username).append("! ")
            append("You win!")
        }.toString()
    }
}
package ru.job4j.oop.list

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 24.03.2021
 */
class SimpleLinkedList<T> : Iterable<T> {
    private var head : Node<T>? = null

    /**
     * Метод реализует добавление значения в связный список
     * @param value - новое значение
     */
    fun add(value: T) {
        val newNode = Node(value)

        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    /**
     * Метод реализует удаление в конце связного список
     * @return - успех удаления
     */
    fun delete(): Boolean {
        var result = false

        if (head != null)  {
            var current = head
            while (current?.next?.next != null) {
                current = current.next
            }
            current?.next = null
            result = true
        }
        return result
    }

    /**
     * Метод реализует получение элемента по индексу
     * @param index - индекс
     * @return - искомый элемент
     */
    fun get(index: Int): T {
        var counter = 0
        var current = head

        if (current?.value != null && current.next == null && index == 0) {
            return current.value
        }

        while (current?.next != null) {
            if (counter == index) {
                return current.value
            }
            current = current.next
            counter++
        }

        throw NoSuchElementException()
    }

    /**
     * Метод создает объект, необходимый для перебора значений связного списка
     */
    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    inner class LinkedIt : Iterator<T> {

        /**
         * Метод проверяет, есть ли следующий элемент в связном списке
         */
        override fun hasNext(): Boolean {
            if (head?.value != null) {
                return true
            }
            return head?.next != null
        }

        /**
         * Метод делает итерацию на один шаг в связном списке
         */
        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            val result = head!!.value
            head = head?.next
            return result
        }
    }

    class Node<K>(var value: K, var next: Node<K>? = null)
}
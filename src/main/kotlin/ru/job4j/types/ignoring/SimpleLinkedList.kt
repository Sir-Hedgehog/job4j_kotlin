package ru.job4j.types.ignoring

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 21.07.2021
 */
class SimpleLinkedList<T> : Iterable<T>, ListIterator<T> {
    private var head : Node<T>? = null
    private var tail : Node<T>? = null
    private var size = 0

    fun add(value: T) {
        val newNode = Node(value)

        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
            tail = newNode
            tail?.previous = current
        }

        size++
    }

    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    inner class LinkedIt : Iterator<T> {
        override fun hasNext(): Boolean {
            if (head?.value != null) {
                return true
            }
            return head?.next != null
        }

        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            val result = head!!.value
            head = head?.next
            return result
        }
    }

    class Node<K>(val value: K, var next: Node<K>? = null, var previous: Node<K>? = null)

    override fun hasNext(): Boolean {
        if (head?.value != null) {
            return true
        }
        return head?.next != null
    }

    override fun hasPrevious(): Boolean {
        if (tail?.value != null) {
            return true
        }
        return tail?.previous != null
    }

    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException()
        }

        val result = head!!.value
        head = head?.next
        return result
    }

    override fun previous(): T {
        if (!hasPrevious()) {
            throw NoSuchElementException()
        }

        val result = tail!!.value
        tail = tail?.previous
        return result
    }

    override fun nextIndex(): Int {
        if (size != 0) {
            return size
        }

        return size
    }

    override fun previousIndex(): Int {
        if (!listOf(0, 1).contains(size)) {
            return size - 2
        }

        return size
    }
}
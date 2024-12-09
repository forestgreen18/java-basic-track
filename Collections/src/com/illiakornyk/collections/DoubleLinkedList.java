package com.illiakornyk.collections;

import com.illiakornyk.airplanes.Airplane;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A generic double-linked list implementation for storing Airplane objects.
 * Implements basic list operations and provides constructors for initialization.
 */
public class DoubleLinkedList<T extends Airplane> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Represents a node in the Double-Linked List.
     *
     * @param <T> the type of data stored in the node.
     */
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    /**
     * Creates an empty DoubleLinkedList.
     */
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Creates a DoubleLinkedList initialized with one Airplane object.
     *
     * @param element the Airplane object to initialize the list with.
     */
    public DoubleLinkedList(T element) {
        this();
        add(element);
    }

    /**
     * Creates a DoubleLinkedList initialized with a collection of Airplane objects.
     *
     * @param collection the collection of Airplane objects to initialize the list with.
     */
    public DoubleLinkedList(Collection<? extends T> collection) {
        this();
        for (T element : collection) {
            add(element);
        }
    }

    /**
     * Adds an Airplane object to the end of the list.
     *
     * @param element the Airplane object to add.
     */
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Removes an Airplane object at the specified index.
     *
     * @param index the index of the object to remove.
     * @return the removed Airplane object.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    public T remove(int index) {
        validateIndex(index);
        Node<T> current = head;

        if (index == 0) {
            T data = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return data;
        }

        if (index == size - 1) {
            T data = tail.data;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
            size--;
            return data;
        }

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T data = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        return data;
    }

    /**
     * Retrieves an Airplane object at the specified index.
     *
     * @param index the index of the object to retrieve.
     * @return the Airplane object at the specified index.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    public T get(int index) {
        validateIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Returns the size of the list.
     *
     * @return the number of elements in the list.
     */
    public int size() {
        return size;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

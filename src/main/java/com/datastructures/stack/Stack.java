/**
 * A linked list implementation of a leetcode.stack
 */
package com.datastructures.stack;

public class Stack<T> implements Iterable<T> {

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    // Create an empty leetcode.stack
    public Stack() {
    }

    // Create a Stack with an initial element
    public Stack(T firstElem) {
        push(firstElem);
    }

    // Return the number of elements in the leetcode.stack
    public int size() {
        return list.size();
    }

    // Check if the leetcode.stack is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Push an element on the leetcode.stack
    public void push(T elem) {
        list.addLast(elem);
    }

    // Pop an element off the leetcode.stack
    // Throws an error is the leetcode.stack is empty
    public T pop() {
        if (isEmpty()) throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    // Peek the top of the leetcode.stack without removing an element
    // Throws an exception if the leetcode.stack is empty
    public T peek() {
        if (isEmpty()) throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    // Allow users to iterate through the leetcode.stack using an iterator
    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }
}

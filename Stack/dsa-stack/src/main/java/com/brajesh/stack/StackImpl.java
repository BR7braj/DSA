package com.brajesh.stack;

import com.brajesh.linkedlist.LinkedList;
import com.brajesh.linkedlist.SinglyLinkedList;

public class StackImpl<E> implements Stack<E> {

    /* LIFO - Last in and first out */

    private LinkedList<E> list;

    public StackImpl() {
        list = new SinglyLinkedList<>();

    }

    @Override
    public void push(E e) {
        list.addFirst(e);

    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public void print() {
        list.print();
    }

}

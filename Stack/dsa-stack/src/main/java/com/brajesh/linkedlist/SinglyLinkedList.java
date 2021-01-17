package com.brajesh.linkedlist;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
        // construct an initially empty linked list
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    @Override
    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    @Override
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    @Override
    public E removeLast() {

        while (head.getNext() != null) {
            head = head.getNext();
        }
        E e = head.getElement();
        head.setNext(null);
        size--;
        return e;

    }

    @Override
    public void print() {
        Node<E> tempHead = head;
        while (tempHead != null) {
            System.out.println("Element : " + tempHead.getElement());
            tempHead = tempHead.getNext();
        }
    }

    @Override
    public void printReverse() {
        LinkedList<E> tempList = new SinglyLinkedList<>();
        Node<E> tempHead  = head;
        while(tempHead != null)
        {
            E e = tempHead.getElement();
            tempList.addLast(e);
            tempHead = tempHead.getNext();
        }
        tempList.print();

    }

}

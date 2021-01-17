package com.brajesh.linkedlist;


public interface LinkedList<E> {
     int size();
     boolean isEmpty();
     E first();
     E last();
     void addFirst(E e);
     void addLast(E e);
     E removeFirst();
     E removeLast();
     void print();
     void printReverse();
       
}

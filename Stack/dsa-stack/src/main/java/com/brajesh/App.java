package com.brajesh;

import com.brajesh.linkedlist.LinkedList;
import com.brajesh.linkedlist.SinglyLinkedList;
import com.brajesh.stack.Stack;
import com.brajesh.stack.StackImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /****start linked list test****/
       /*  LinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("Brajesh");
        list.addFirst("Kumar");
        list.addFirst("Mondal");
        System.out.println(list.first());
        System.out.println(list.last());
        list.print(); */
        /***End of linked list ****/
        Stack<String> stack = new StackImpl<>();
        stack.push("Brajesh");
        stack.push("Kumar");
        stack.push("Mondal");
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

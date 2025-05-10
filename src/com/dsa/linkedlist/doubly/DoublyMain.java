package com.dsa.linkedlist.doubly;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        list.addToEnd(5);

        list.printList();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.removeFromFront();
        list.printList();
        System.out.println(list.size());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.size());
        list.addBefore(10, 1);
        list.printList();
    }
}

package com.dsa.linkedlist.singly;

public class SinglyMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);

        list.printList();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.removeFromFront();
        list.printList();
        System.out.println(list.size());
    }
}

package com.dsa.linkedlist.singly;

public class SinglyLinkedList {

    private SingleNode head;

    private int size;

    public void addToFront(int val){
        SingleNode currentNode = new SingleNode(val);
        currentNode.next = head;
        head = currentNode;
        size++;
    }

    public int size(){
        return getSize();
    }

    public boolean isEmpty(){
        return head == null;
    }

    public SingleNode removeFromFront(){
        if(isEmpty())
            return null;
        SingleNode removedNode = head;
        head = head.next;
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public void printList(){
        SingleNode node = head;
        System.out.print("head -> ");
        while (node !=null){
            System.out.print(node);
            System.out.print(" -> ");
            node = node.getNext();
        }
        System.out.println("null");
    }
}

package com.dsa.linkedlist.doubly;

public class DoublyLinkedList {

    private DoubleNode head;
    private DoubleNode tail;

    private int size;

    public void addToFront(int val){
        DoubleNode currentNode = new DoubleNode(val);
        if(head == null)
            tail = currentNode;
        else
            head.prev = currentNode;
        currentNode.next = head;
        head = currentNode;
        size++;
    }

    public void addToEnd(int val){
        DoubleNode currentNode = new DoubleNode(val);
        if(tail == null)
            head = currentNode;
        else {
            tail.next = currentNode;
            currentNode.prev = tail;
        }
        tail = currentNode;
        size++;
    }

    public void addBefore(int val, int existingVal){

        DoubleNode currNode;
        if(head.getData() == existingVal && head.getNext() == null) {
            currNode = new DoubleNode(val);
            currNode.setNext(head);
            head.setPrev(currNode);
            head = currNode;
        }else
        while(head.getNext() != null){
            if(head.getData() == existingVal) {
                currNode = new DoubleNode(val);
                currNode.setNext(head);
                head.setPrev(currNode);
                size++;
                break;
            }
            head = head.getNext();
        }
    }

    public int size(){
        return getSize();
    }

    public boolean isEmpty(){
        return head == null;
    }

    public DoubleNode removeFromFront(){
        if(isEmpty())
            return null;
        DoubleNode removedNode = head;
        if(head.getNext() == null)
            tail = null;
        else{
            head.getNext().setPrev(null);
        }
        head = head.next;
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public DoubleNode removeFromEnd(){
        if(isEmpty())
            return null;
        DoubleNode removedNode = tail;
        if(tail.getPrev() == null)
            head = null;
        else{
            tail.getPrev().setNext(null);
        }
        tail = tail.prev;
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public void printList(){
        DoubleNode node = head;
        System.out.print("head -> ");
        while (node !=null){
            System.out.print(node);
            System.out.print(" <-> ");
            node = node.getNext();
        }
        System.out.println("null");
    }
}

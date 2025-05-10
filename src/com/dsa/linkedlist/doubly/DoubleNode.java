package com.dsa.linkedlist.doubly;

public class DoubleNode {

    public DoubleNode prev;
    public int data;
    public DoubleNode next;

    public DoubleNode(int val){
        this.data = val;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

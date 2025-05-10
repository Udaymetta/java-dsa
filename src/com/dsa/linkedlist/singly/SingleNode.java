package com.dsa.linkedlist.singly;

public class SingleNode {

    public int data;
    public SingleNode next;

    public SingleNode(int val){
        this.data = val;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
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

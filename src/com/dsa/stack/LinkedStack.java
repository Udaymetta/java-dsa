package com.dsa.stack;

import java.util.LinkedList;


/**
* This is used to use stack implementation in LinkedList without accessing the other methods in LinkedList
*/
public class LinkedStack<T> {

    public LinkedList<T> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(T val) {
        stack.push(val);
    }

    public T peek(){
        return stack.peek();
    }

    public T pop(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        for (T t : stack) {
            System.out.println(t);
        }
    }
}

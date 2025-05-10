package com.dsa.stack;

import java.util.EmptyStackException;

public class StackHandler {

    Integer[] stack;
    int top;

    public StackHandler(int capacity){
        stack = new Integer[capacity];
    }

    public void push(int i){
        if(top == stack.length){
            Integer[] newStack = new Integer[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = i;
    }

    public Integer pop(){
        if(isEmpty())
            throw new EmptyStackException();
        Integer n = stack[--top];
        stack[top] = null;
        return n;
    }

    public Integer peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top -1];
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public Integer size(){
        return top;
    }

    public void print(){
        for(int i = top -1 ; i>=0 ;i--){
            System.out.println(stack[i]);
        }
    }
}

package com.dsa.stack;

public class StackMain {

    public static void main(String[] args) {
//        useStack();
        useLinkedStack();
    }

    private static void useStack(){
        StackHandler stack = new StackHandler(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        stack.print();
    }

    private static void useLinkedStack(){

        LinkedStack<String> stack = new LinkedStack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack.peek());
//
        System.out.println(stack.pop());

        stack.printStack();
    }
}

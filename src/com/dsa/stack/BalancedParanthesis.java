package com.dsa.stack;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String s1 = "{}()[]";
        System.out.println( s1 + " - "+ isValid(s1));
        String s2 = "{}([[]";
        System.out.println( s2 + " - "+  isValid(s2));
        String s3 = "{()}[]";
        System.out.println( s3 + " - "+  isValid(s3));
        String s4 = "{ab}[]";
        System.out.println( s4 + " - "+  isValid(s4));
    }

    public static boolean isValid(String input){
        Stack<Character>  stack = new Stack<>();
        for(char n : input.toCharArray()){
            if(n == '(' || n == '{' || n== '['){
                stack.push(n);
            } else {
                if(stack.isEmpty())
                    return false;
                else if((n == ')' && stack.peek() == '(') || (n == '}' && stack.peek() == '{') || (n == ']' && stack.peek() == '[')) {
                   stack.pop();
                }
                else
                    continue;
            }
        }
        return stack.isEmpty();
    }

}

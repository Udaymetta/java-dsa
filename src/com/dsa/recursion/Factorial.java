package com.dsa.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

    private static long recursiveFactorial(int num){
        if(num == 0)
            return 1;

        return num * recursiveFactorial(num -1);
    }
}

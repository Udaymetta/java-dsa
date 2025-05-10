package com.dsa.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
        insertionSort(intArr);
        System.out.println("\nAfter Sorting");
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
    }
//  Time Complexity = O(n²) - Quadratic
//  Space Complexity = O(1) - Constant
    private static void insertionSort(int[] intArr){
        for (int i = 1; i < intArr.length; i++) {
            int element = intArr[i];
            int j;
            for(j = i ; j > 0 && intArr[j-1] > element; j--){
                intArr[j]=intArr[j-1];
            }
            intArr[j] = element;
        }
    }
}
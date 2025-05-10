package com.dsa.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArr = {20, 55, 35, -15, 7, 1, -22};
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
        shellSort(intArr);
        System.out.println("\nAfter Sorting");
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
    }
//  Time Complexity = O(n log² n) -  Super-Logarithmic
//  Space Complexity = O(1) - Constant
    private static void shellSort(int[] intArr){
        for (int gap = intArr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArr.length; i++) {
                int key = intArr[i];
                int j = i;
                while (j >= gap && intArr[j - gap] > key) {
                    intArr[j] = intArr[j - gap];
                    j -= gap;
                }
                intArr[j] = key;
            }
        }
    }
     public static void swap (int[] arr, int largest, int i){
        int swap = arr[largest];
        arr[largest] = arr[i];
        arr[i] = swap;
     }
}
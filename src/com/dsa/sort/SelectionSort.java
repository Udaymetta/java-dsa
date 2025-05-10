package com.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
        selectionSort(intArr);
        System.out.println("\nAfter Sorting");
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
    }

//  Time Complexity = O(n²) - Quadratic
//  Space Complexity = O(1) - Constant
    private static void selectionSort(int[] intArr){
        for (int i = intArr.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (intArr[j] > intArr[largest]) {
                    largest = j;
                }
            }
            swap(intArr, largest, i);
        }
    }
     public static void swap (int[] arr, int largest, int i){
        int swap = arr[largest];
        arr[largest] = arr[i];
        arr[i] = swap;
     }
}
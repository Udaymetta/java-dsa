package com.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
        bubbleSort(intArr);
        System.out.println("\nAfter Sorting");
        Arrays.stream(intArr).forEach(i-> System.out.print(i + " "));
    }

//  Time Complexity = O(n²) - Quadratic
//  Space Complexity = O(1) - Constant
    private static void bubbleSort(int[] intArr){
        for (int i = intArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    swap(intArr, j, j+1);
                }
            }
        }
    }

    private static void swap (int[] arr, int largest, int i){
        int swap = arr[largest];
        arr[largest] = arr[i];
        arr[i] = swap;
    }
}
package com.dsa.sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] intArr = {20, 55, 35, -15, 7, 1, -22};
//       Time Complexity = O(n²) - Quadratic
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

        for (int j : intArr)
            System.out.println(j);
    }
     public static void swap (int[] arr, int largest, int i){
        int swap = arr[largest];
        arr[largest] = arr[i];
        arr[i] = swap;
     }
}
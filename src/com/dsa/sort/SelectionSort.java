package com.dsa.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
//       Time Complexity = O(n²) - Quadratic
//       Start from end of Array and decrement
        for (int i = intArr.length - 1; i > 0; i--) {
            int largest = 0;
//            Find the index of largest element
            for (int j = 1; j <= i; j++) {
                if (intArr[j] > intArr[largest]) {
                    largest = j;
                }
            }
//            Pass the array, largest element index, index needed swap
            swap(intArr, largest, i);
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
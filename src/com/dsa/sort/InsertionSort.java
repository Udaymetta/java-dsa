package com.dsa.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
//        test(intArr);
//       Time Complexity = O(n²) - Quadratic
        for (int i = 1; i < intArr.length; i++) {
            int element = intArr[i];
            int j;
            for(j = i ; j > 0 && intArr[j-1] > element; j--){
                intArr[j]=intArr[j-1];
            }
            intArr[j] = element;
        }
        for (int j : intArr)
            System.out.println(j);
    }

    public static void test(int[] intArr){
//      Start from Starting of Array and decrement
        for (int i = 1; i < intArr.length; i++) {
            int largest = i;
//          Start from array beyond the i th index, compare the values to the left of the i th index and swap
            for (int j = i-1; j >= 0; j--) {
                if (intArr[j] > intArr[largest]) {
                    largest = j;
                    swap(intArr, largest, largest + 1);
                }
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
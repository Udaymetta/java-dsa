package com.dsa.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
//       Time Complexity = O(n²) - Quadratic
//       Start from end of Array and decrement
        for (int i = intArr.length - 1; i > 0; i--) {
//           Start from starting of array and increment and traverse beyond the i th index
            for (int j = 0; j < i; j++) {
//                If the j is greater than j+1 then swap using third variable
                if (intArr[j] > intArr[j + 1]) {
//              Pass the array, largest element index, index needed swap
                    swap(intArr, j, j+1);
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
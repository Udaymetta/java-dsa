package com.dsa.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,5,18,40,6,2};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("\nAfter Sorting");
        mergeSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);
    }
//  Time Complexity = O(n log n) - Logarithmic
//  Space Complexity = O(n) - Linear
    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r){
            int mid = (l + r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int length1= mid - l + 1;
        int length2 = r - mid;

        int[] leftArr = new int[length1];
        int[] rightArr = new int[length2];

        System.arraycopy(arr, l, leftArr, 0, length1);
        System.arraycopy(arr, mid+1, rightArr, 0, length2);

        int i = 0, j = 0, k = l;

        while (i < length1 && j < length2){
            arr[k++] = leftArr[i] <= rightArr[j] ? leftArr[i++] : rightArr[j++];
        }

        while (i < length1){
            arr[k++] = leftArr[i++];
        }

        while (j < length2){
            arr[k++] = rightArr[j++];
        }
    }


}

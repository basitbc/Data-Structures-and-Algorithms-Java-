package com.Sorting;

public class selectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        int arr[] = {101, 222, 31, 40, 15, 16,111,343334,232,3,4343,2,44,3,4};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

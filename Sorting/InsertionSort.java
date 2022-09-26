package com.Sorting;

public class InsertionSort {
    static void InsertionSort(int[] arr){
        int length = arr.length;
        for (int i =0; i<length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
    public static void main(String[] args){
        int arr[] ={3,60,35,2,45,30,5,10,11,333,4,200,21};

        System.out.println("Array Before Insertion Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        InsertionSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Insertion Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}



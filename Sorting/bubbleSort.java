package com.Sorting;

public class bubbleSort {
        static void bubbleSort(int[] arr) {
           int len = arr.length;
           for(int i =0; i<len;i++){
               boolean swapped = false;
               for(int j=0;j<len-i-1; j++ ){
                   if(arr[j]>arr[j+1]){
                       int temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                       swapped = true;
                   }
               }
               if(swapped==false){
                   break;
               }
           }

        }
        public static void main(String[] args) {
            int arr[] ={3,60,35,2,45,30,5,10,11,333,4,200,21};

            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            bubbleSort(arr);//sorting array elements using bubble sort

            System.out.println("Array After Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }

}

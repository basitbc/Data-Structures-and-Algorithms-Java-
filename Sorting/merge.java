package com.Sorting;

public class merge {
    public static void mergeSort(int arr1[], int arr2[]){
        int i= 0;
        int j =0;
        int m = arr1.length;
        int n = arr2.length;

        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                System.out.print(arr1[i++]+" ");
            }
            else{
                System.out.print(arr2[j++]+" ");
            }
        }
        while(i<m)
            System.out.print(arr1[i++]+" ");
        while(j<n)
            System.out.print(arr2[j++]+" ");
    }
public static void main(String[] args){
        int arr1[]={1,2,3,4,50,60};
        int arr2[]= {5,6,7,8,110,111};
    mergeSort(arr1, arr2);

}
}

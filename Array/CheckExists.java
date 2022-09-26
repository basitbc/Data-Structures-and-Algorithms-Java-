package com.Array;

public class CheckExists {
    static boolean CheckExists(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2.length; j++)
                if (arr2[j] == arr1[i]) {
                    break;
                }

            /* If the above inner loop
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == arr2.length) {
                System.out.println(j);
                System.out.println(arr2.length);
                return false;
            }
        }

        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {45,30,5,10,11,12,12,12};
        int arr2[] ={3,60,35,2,45,30,5,10,12,11,333,4,200,21};


        System.out.println(
                CheckExists(arr1, arr2)
        );
         //sorting array elements using bubble sort

        }

    }

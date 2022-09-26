package com.Sorting;

public class merge2 {
    static void mergeSort2(int arr[], int l, int m, int h){
        int n1=m-l+1;
        int n2 =h-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = arr[i];
        }
        for(int j=0; j<n2; j++){
            right[j] = arr[j+m+1];
        }
        int x = 0;
        int y = 0;
        int k =0;

        while(x<=n1 && y<n2){
            if(left[x] < right[y]){
                arr[k++] = left[x++];
            }
            else{
                arr[k++] = right[y++];
            }
        }

        while(x<n1){
            arr[k++] = left[x++];
        }
        while(y<n2){
            arr[k++] = right[y++];
        }




    }

    public static void main(String[] args){
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
        int l=0,h=8,m=3;

        mergeSort2(a,l,m,h);
        for(int x: a)
            System.out.print(x+" ");

    }
}

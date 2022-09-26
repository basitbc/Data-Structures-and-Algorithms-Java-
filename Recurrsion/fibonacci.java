package com.Recurrsion;

public class fibonacci {
    public static void fibonacci(int a){
        int num1 = 0;
        int num2 = 1;
        int count = 0;
        while(count<a){
            System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count++;
        }
    }


    public static void main(String[] args){
        fibonacci(10);
    }
}

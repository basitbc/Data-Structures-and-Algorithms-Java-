package com.BitwiseOperators;

public class powerOfTwo {
    public static boolean powerOfTwo(int n){
        if(n==0){
            return false;
        }
        return ((n & (n-1)) == 0);


    }
    public static void main(String[] args){
       int num = 8;
        System.out.println(powerOfTwo(num));
    }
}

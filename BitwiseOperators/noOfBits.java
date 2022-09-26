package com.BitwiseOperators;

public class noOfBits {
    public static int noOfBits(int num){

        int count = 0;
        for (int i =0;i<32; i++){

            if((num>>i&1)==1){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){
        int num = 7 ;
        System.out.println(noOfBits(num));
    }
}

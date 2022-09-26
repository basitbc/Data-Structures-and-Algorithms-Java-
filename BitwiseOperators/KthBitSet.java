package com.BitwiseOperators;

public class KthBitSet {
    public static void KthBitSet(int num, int k){
       if((1<<(k-1)&num)!=0){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
        }






    public static void main(String[] args){
        int num = 5;
        int k= 3;
        KthBitSet(num,k);

    }
}

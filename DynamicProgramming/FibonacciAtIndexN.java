package com.DynamicProgramming;
import java.io.*;
import java.util.*;
import static java.lang.System.out;

import java.util.Scanner;

class FibonacciAtIndexN {

    //       Initialize Memo Array of Size n for memoization
    static int[] memo;
    static int fib(int n){
//        Check if value at n is already computed and stored in memo otherwise compute
        if(memo[n] == -1){
            int res;
//            Two base cases of fibonacci series
            if(n ==0 || n ==1){
                res = n;
            }
            else {
                res = fib(n - 1) + fib(n - 2);
            }
            memo[n]= res;
        }
        return memo[n];


    }
    public static void main (String[] args) {

        int n = 35;

        memo = new int[n+1];

        Arrays.fill(memo,-1);

        System.out.println(fib(n));

    }
}

package com.Recurrsion;
import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class editDistance {
    public static int eD(String s1, String s2, int m, int n){
        if(m==0) return n;
        if(n==0) return m;

        if(s1.charAt(m-1)== s2.charAt(n-1)){
            return eD(s1, s2, m-1, n-1);
        }
        else{
            return 1 + Math.min(eD(s1,s2,m,n-1), Math.min(eD(s1,s2,m-1,n),
                    eD(s1,s2,m-1,n-1)));
        }
    }


    public static void main(String[] args) {
        String s1 = "Saturday";
        String s2 = "Sunday";
        int m = 8;
        int n = 6;
        System.out.println(eD(s1, s2, m, n));
    }
}

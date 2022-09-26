//package com.Recurrsion;
//
//import java.util.Map;
//import java.util.Scanner;
//
//public class maxSkill {
//    int n;
//    static int[] t = new int[1001];
//    static int[] s = new int[1001];
//    static int x;
//    static int k;
//    int taken [] = new int[1001];
//    public boolean check(int level) {
//    int timeTaken =0;
//    int itemTaken = 0;
//    for (int i =0; i<level; i++){
//        if(taken[i]){
//        timeTaken+=t[i];
//        itemTaken+=1;
//        }
//    }
//    timeTaken+=t[level];
//    itemTaken++;
//    if(itemTaken<=x && itemTaken<=k){
//        return true;
//    }
//    else {
//        return false;
//    }
//    }
//    public static int maxSkill(int level) {
//        if(level==n){
//            return 0;
//        }
//
//    int ans = maxSkill(level+1);
//        if(check(level)){
//            taken[level]=1;
//            ans = Math.max(ans,s[level]+maxSkill(level+1));
//            taken[level] = 0;
//        }
//        return ans;
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        n = sc.nextInt();
//        for(int i = 0; i<n; i++)
//        {
//            t[i] = sc.nextInt();
//            s[i] = sc.nextInt();
//        }
//        x = sc.nextInt();
//        k = sc.nextInt();
//        System.out.println(maxSkill(0));
//    }
//}

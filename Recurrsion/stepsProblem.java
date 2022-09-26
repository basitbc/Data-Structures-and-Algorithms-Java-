package com.Recurrsion;

public class stepsProblem {
    public static void main(String[] args) {
        System.out.println(stepsProblem(4));
    }
    static int N = 4;
    public static int stepsProblem(int level) {
        if(level == N){
            return 1;
        }
        int ans= 0;
        for(int step =1; step<=3; step++){
            if(level <= N){
                int ways = stepsProblem(step + level );
                ans+=ways;
            }
        }
        return ans;
    }
}

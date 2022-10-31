package com.DynamicProgramming;

public class coinChange {
    static int countWays(int coins[], int n, int s){
        int dp[][] = new int[n+1][s+1];
        for(int i =0; i<=n; i++){
            dp[i][0]=1;
        }
        for(int i =0; i<=s; i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1; i<=s; j++){
                dp[i][j]= dp[i-j][j];
                if(coins[i-1]<=j){
                    dp[i][j]+=dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[n][s];

    }

    public static void main(String[] args) {
        int n=3;
        int coins[] = new int[]{1,2,3};
        int s = 5;
        System.out.println(countWays(coins,n,s));
    }
}

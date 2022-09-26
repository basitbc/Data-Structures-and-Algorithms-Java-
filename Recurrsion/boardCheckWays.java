package com.Recurrsion;

public class boardCheckWays {
    public static int[] queen = new int[20];
     static int n = 4;
    public static boolean  check(int row, int col) {
        for(int i = 0; i<row; i++){
            int prow = i;
            int pcol = queen[i];
            if(pcol==col || Math.abs(col-pcol)==Math.abs(row-prow)){
                return false;
            }
        }
        return true;
    }

    public static int checkWays(int level) {
//        Base Case
        if (level == n) {
            return 1;
        }

//        Compute
        int ans = 0;
//        loop over all choices
        for (int col = 0; col<n; col++){
            if (check(level, col)) {
//            Place the queen
                queen[level] = col;
//             Explore the option
                ans += checkWays(level + 1);
//            Revert Placing the queen
                queen[level] = -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(checkWays(0 ));
    }
}

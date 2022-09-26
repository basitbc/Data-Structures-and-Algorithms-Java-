package com.Strings;

public class isPalindrome {
    static boolean isPalindrome(String x){
        int length = x.length();
            int end = length - 1;
            int start = 0;

            while (start <= end) {
                    Character s1 = x.charAt(start);
                    Character s2 = x.charAt(end);

                if (!s1.equals(s2)) {

                    return false;
                }
                start++;
                end--;
            }

        return true;
    }

    public static void main(String[] args){
        String x = "saippuakivikauppias";
        System.out.println(isPalindrome(x));

    }
}

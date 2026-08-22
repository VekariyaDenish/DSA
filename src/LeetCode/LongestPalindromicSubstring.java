package LeetCode;


//5. Longest Palindromic Substring

import java.util.Arrays;

public class LongestPalindromicSubstring {

    private static int[][] t;

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    static String longestPalindrome(String s) {

            int n = s.length();
            int maxlen = Integer.MIN_VALUE;
            int startingIndex = 0;
            t = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(t[i], -1);
            }

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (solve(s, i, j) && j - i + 1 > maxlen) {
                        startingIndex = i;
                        maxlen = j - i + 1;
                    }
                }
            }

            return s.substring(startingIndex, startingIndex + maxlen);
        }

        static boolean solve(String s, int l, int r) {
            if (l >= r) {
                return true;
            }

            if (t[l][r] != -1) {
                return t[l][r] == 1;
            }

            if (s.charAt(l) == s.charAt(r)) {
                t[l][r] = solve(s, l + 1, r - 1) ? 1 : 0;
            } else {
                t[l][r] = 0;
            }

            return t[l][r] == 1;
        }
}

package LeetCode;

//5. Longest Palindromic Substring

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd length:  "aba"  → center at i
            int odd  = expand(s, i, i);
            // Even length: "abba" → center between i and i+1
            int even = expand(s, i, i + 1);

            int len = Math.max(odd, even);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;  // back-calculate start index
            }
        }

        return s.substring(start, start + maxLen);
    }

    static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // when loop exits, left & right are ONE step OUTSIDE the palindrome
        return right - left - 1;  // actual palindrome length
    }
}

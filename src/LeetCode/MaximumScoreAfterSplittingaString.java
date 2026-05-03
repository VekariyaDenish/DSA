package LeetCode;

//1422. Maximum Score After Splitting a String

public class MaximumScoreAfterSplittingaString {
    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
    static int maxScore(String s) {
        int n = s.length();
        int result = Integer.MIN_VALUE;

        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                zeros++;
            }

            result = Math.max(result, zeros - ones);
        }

        if (s.charAt(n - 1) == '1') {
            ones++;
        }

        return result + ones;
    }
}

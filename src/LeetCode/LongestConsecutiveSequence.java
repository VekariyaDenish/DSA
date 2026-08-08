package LeetCode;

//128. Longest Consecutive Sequence

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int [] nums = {};

        System.out.println(longestConsecutive(nums));

    }
    static int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }
            else if (nums[i] == nums[i - 1]) {
                // duplicate, ignore it
            }
            else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;

    }
}

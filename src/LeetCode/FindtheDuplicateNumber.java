package LeetCode;

//287. Find the Duplicate Number

import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));

    }
    static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}


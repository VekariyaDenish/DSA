package LeetCode;

//287. Find the Duplicate Number

import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));

    }
    static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}


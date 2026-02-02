package Arrays;

//53. Maximum Subarray

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] ans = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(ans));

    }
    static int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr_max=nums[0];

        for (int i = 1; i < nums.length; i++) {
             curr_max = Math.max(nums[i],nums[i]+curr_max);

             max = Math.max(curr_max,max);
        }
        return max;
    }
}

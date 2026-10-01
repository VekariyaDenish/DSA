package LeetCode;

//198. House Robber

public class HouseRobber {
    public static void main(String[] args) {
        int [] nums = {2,1,1,2};
        System.out.println(rob(nums));

    }
    static int rob(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return 1;
        }

        int [] dp = new int[n];

        dp[0]=nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < n; i++) {

            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        return dp[n-1];
    }
}

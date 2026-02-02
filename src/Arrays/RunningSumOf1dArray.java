package Arrays;


import java.util.Arrays;

//1480. Running Sum of 1d Array
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(num)));
    }
    static int[] runningSum(int[] nums) {
        int [] ans = nums;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i]+nums[i-1];
        }
        return ans;
    }
}

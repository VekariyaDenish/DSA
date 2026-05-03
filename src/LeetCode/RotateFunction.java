package LeetCode;

//396. Rotate Function

public class RotateFunction {
    public static void main(String[] args) {
        int [] nums = {4,3,2,6};
        System.out.println(maxRotateFunction(nums));
    }
    static int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long f = 0;

        // Calculate total sum and F(0)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long max = f;

        // Calculate remaining rotations
        for (int k = 1; k < n; k++) {
            f = f + sum - (long) n * nums[n - k];
            max = Math.max(max, f);
        }

        return (int) max;
    }
}

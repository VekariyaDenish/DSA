package LeetCode;

//3660. Jump Game IX

import java.util.Arrays;

public class JumpGameIX {
    public static void main(String[] args) {
            int [] ans = {1,2,3};
        System.out.println(Arrays.toString(maxValue(ans)));
    }
    static int[] maxValue(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            int curr = i;
            int max = nums[i];

            while (true) {

                int next = -1;

                // find one possible jump
                for (int j = 0; j < n; j++) {

                    if (j > curr && nums[j] < nums[curr]) {
                        next = j;
                        break;
                    }

                    if (j < curr && nums[j] > nums[curr]) {
                        next = j;
                        break;
                    }
                }

                // no move possible
                if (next == -1) break;

                curr = next;
                max = Math.max(max, nums[curr]);
            }

            ans[i] = max;
        }

        return ans;
    }
}

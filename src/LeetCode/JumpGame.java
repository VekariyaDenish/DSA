package LeetCode;

//55. Jump Game

public class JumpGame {
    public static void main(String[] args) {
        int [] ans = {3,2,1,0,4};
        System.out.println(canJump(ans));
    }
    static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // can't reach this index
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; // reached or passed last index
            }
        }

        return true;
    }
}

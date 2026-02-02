package Arrays;

import java.util.Arrays;

//1920. Build Array from Permutation

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] num = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(num)));
    }
    static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

package Arrays;

//1365. How Many Numbers Are Smaller Than the Current no

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int []nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
                count = 0;
            for (int j = 0; j < nums.length ; j++) {
                if( nums[i] == nums[j]){
                    continue;
                }
                if(nums[i]>nums[j]){
                    count ++;
                    ans[i]=count;
                }
            }
        }
        return ans;
    }
}

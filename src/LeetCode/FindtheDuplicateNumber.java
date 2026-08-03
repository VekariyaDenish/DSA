package LeetCode;

//287. Find the Duplicate Number

import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));

    }
    static int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int value = nums[i]-1;
                if(nums[i]!=nums[value]){
                    swapping(nums,i,value);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swapping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}


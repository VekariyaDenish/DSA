package Arrays;

//26. Remove Duplicates from Sorted Array

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int [] arr = {0,0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

    }
    static int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length-1; j++) {
            if(nums[i]!=nums[j]){
                i++;
            nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

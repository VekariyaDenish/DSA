package LeetCode;

public class SortColors {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};

        sortColors(arr);

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
        }

    }
    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;

                }
            }
            if(!swapped) break;
        }
    }
}

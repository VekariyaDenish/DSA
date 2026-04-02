package LeetCode;

//3046. Split the Array
public class SplittheArray {
    public static void main(String[] args) {
     int [] nums = {1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums));
     }
    static boolean isPossibleToSplit(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
            if (count[num] > 2) {
                return false;
            }
        }
        return true;
    }

}

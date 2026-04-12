package LeetCode;

//27. Remove Element

public class RemoveElement {
    public static void main(String[] args) {
        int [] num = {3,2,2,3};
        System.out.println(removeElement(num,3));
    }
    static int removeElement(int[] nums, int val) {
        int k = 0; // position for next valid element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move valid element forward
                k++;
            }
        }

        return k; // new length
    }
}

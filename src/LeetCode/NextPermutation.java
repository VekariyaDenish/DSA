package LeetCode;

//31. Next Permutation

import com.sun.source.tree.BreakTree;

import static LeetCode.RotateArray.reverse;

public class NextPermutation {
    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 4};

        nextPermutation(nums);


    }

        static void nextPermutation(int[] nums) {

            int n = nums.length;
            int breakPoint = -1;

            // Step 1: Find the breakpoint
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    breakPoint = i;
                    break;
                }
            }

            // Step 2: If no breakpoint, reverse the whole array
            if (breakPoint == -1) {
                reverse(nums, 0, n - 1);
                return;
            }

            // Step 3: Find the next greater element from the right
            for (int i = n - 1; i > breakPoint; i--) {
                if (nums[i] > nums[breakPoint]) {
                    swap(nums, i, breakPoint);
                    break;
                }
            }

            // Step 4: Reverse the suffix
            reverse(nums, breakPoint + 1, n - 1);
        }

        static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        static void reverse(int[] nums, int left, int right) {
            while (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
    }




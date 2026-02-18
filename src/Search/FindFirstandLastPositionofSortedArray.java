package Search;

//34. Find First and Last Position of SortedArray


import java.util.Arrays;

public class FindFirstandLastPositionofSortedArray {
    public static void main(String[] args) {

        int [] nums = {5,7,7,8,8,10};

        System.out.println(Arrays.deepToString(searchRange(nums,8)));

    }
    static int[][] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[][] { {first, last} };
    }

    static int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;      // possible first
                end = mid - 1;  // keep searching start
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    static int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;     // possible last
                start = mid + 1;  // keep searching right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}

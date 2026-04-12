package LeetCode;

//88. Merge Sorted Array

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        merge(num1,3,num2,3);
        System.out.println(num1);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // last element of nums1
        int j = n - 1;      // last element of nums2
        int k = m + n - 1;  // last position of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // if nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

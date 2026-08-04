package LeetCode;

//88. Merge Sorted Array

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        int [] ans = new int[3+3];
        merge(num1,3,num2,3);


        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {

//        int[] ans = new int[m + n];
//
//        int k = 0;
//
//        for (int i = 0; i < m; i++) {
//            ans[i] = nums1[i];
//            k++;
//        }
//
//        for (int i = 0; i < n; i++) {
//            ans[k + i] = nums2[i];
//        }
//
//        sort(ans);
//
//        // Copy back to nums1
//        for (int i = 0; i < ans.length; i++) {
//            nums1[i] = ans[i];
//        }
//
//    }
//
//    static void sort(int [] arr ) {
//        for (int i = 0; i < arr.length; i++) {
//            boolean swapped = false;
//            for (int j = 1; j < arr.length; j++) {
//                if(arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    swapped = true;
//                }
//            }
//            if(!swapped) {
//                break;
//            }
//        }
//    }





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
